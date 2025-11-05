package com.foodzone.app.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodzone.app.databinding.RowCatBinding

class CatAdapter(val data:List<Cat>, val click:(Cat)->Unit):RecyclerView.Adapter<CatAdapter.Holder>(){
 inner class Holder(val b:RowCatBinding):RecyclerView.ViewHolder(b.root)
 override fun onCreateViewHolder(p:ViewGroup,v:Int)=Holder(RowCatBinding.inflate(LayoutInflater.from(p.context),p,false))
 override fun getItemCount()=data.size
 override fun onBindViewHolder(h:Holder,i:Int){ val d=data[i];h.b.txt.text=d.name;h.b.root.setOnClickListener{click(d)} }
}