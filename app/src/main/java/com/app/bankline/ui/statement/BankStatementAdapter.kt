package com.app.bankline.ui.statement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.bankline.R
import com.app.bankline.databinding.BankStatementItemBinding
import com.app.bankline.domain.Movimentacao
import com.app.bankline.domain.TipoMovimentacao

class BankStatementAdapter(private val dataSet: List<Movimentacao>) : RecyclerView.Adapter<BankStatementAdapter.ViewHolder>() {

    class ViewHolder(private val binding: BankStatementItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movimentacao) = with(binding) {
            tvDatetime.text = item.dataHora
            tvDescription.text = item.descricao
            tvValue.text = item.valor.toString()
            val typeIcon = if (TipoMovimentacao.RECEITA == item.tipo) R.drawable.ic_add else R.drawable.ic_remove
            ivIcon.setImageResource(typeIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BankStatementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.bind(item)
    }

    override fun getItemCount() = dataSet.size
}