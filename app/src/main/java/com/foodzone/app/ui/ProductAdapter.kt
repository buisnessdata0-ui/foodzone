package com.foodzone.app.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodzone.app.databinding.RowProductBinding

class ProductAdapter(val d:List<Product>):RecyclerView.Adapter<ProductAdapter.Holder>(){
 inner class Holder(val b:RowProductBinding):RecyclerView.ViewHolder(b.root)
 override fun onCreateViewHolder(p:ViewGroup,v:Int)=Holder(RowProductBinding.inflate(LayoutInflater.from(p.context),p,false))
 override fun getItemCount()=d.size
 override fun onBindViewHolder(h:Holder,i:Int){ val x=d[i];h.b.txtName.text=x.name;h.b.txtPrice.text="₹${x.price}" }
}