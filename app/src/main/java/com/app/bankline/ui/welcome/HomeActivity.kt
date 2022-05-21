package com.app.bankline.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.bankline.R
import com.app.bankline.databinding.ActivityHomeBinding
import com.app.bankline.domain.Correntista
import com.app.bankline.ui.statement.BankStatementActivity

class HomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAcessar.setOnClickListener() {
            val accountHolderId = binding.edtID.text.toString().toInt()
            val accountHolder = Correntista(accountHolderId)
            val intent = Intent(this, BankStatementActivity::class.java).apply {
                putExtra(BankStatementActivity.EXTRA_ACCOUNT_HOLDER, accountHolder)
            }

            startActivity(intent)

        }
    }
}