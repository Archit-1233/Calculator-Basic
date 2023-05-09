package com.example.geekyhub.calculatorui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils

import android.widget.TextView
import com.example.geekyhub.calculatorui.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener(){

            var text =inputtext.text.toString()
            if(text.length >=1){
                text=text.substring(0,text.length-1)
                inputtext.text=text
            }
        }

        binding.clear.setOnClickListener(){
            binding.inputtext.text =" "
            binding.outputtext.text =" "
        }
        binding.num0.setOnClickListener(){
            binding.inputtext.append("0")
        }
        binding.num1.setOnClickListener(){
            binding.inputtext.append("1")
        }
        binding.num2.setOnClickListener(){
            binding.inputtext.append("2")
        }
        binding.num3.setOnClickListener(){
            binding.inputtext.append("3")
        }

        binding.num4.setOnClickListener(){
            binding.inputtext.append("4")
        }
        binding.num5.setOnClickListener(){
            binding.inputtext.append("5")
        }
        binding.num6.setOnClickListener(){
            binding.inputtext.append("6")
        }
        binding.num7.setOnClickListener(){
            binding.inputtext.append("7")
        }
        binding.num8.setOnClickListener(){
            binding.inputtext.append("8")
        }
        binding.num9.setOnClickListener(){
            binding.inputtext.append("9")
        }
        binding.num00.setOnClickListener(){
            binding.inputtext.append("0")
        }
        binding.Add.setOnClickListener(){
            binding.inputtext.append("+")
        }
        binding.Minus.setOnClickListener(){
            binding.inputtext.append("-")
        }
        binding.Multiply.setOnClickListener(){
            binding.inputtext.append("*")
        }
        binding.Divide.setOnClickListener(){
            binding.inputtext.append("/")
        }
        binding.dot.setOnClickListener(){
            binding.inputtext.append(".")
        }
        binding.rem.setOnClickListener(){
            binding.inputtext.append("%")
        }
        binding.equal.setOnClickListener() {
            if(binding.inputtext.text.isNullOrEmpty()){
                binding.inputtext.append("Syntax Error")
            }

        }
        binding.equal.setOnClickListener(){
            val expression=ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result=expression.evaluate()
            val longresult=result.toLong()


            if(result==longresult.toDouble()){
                binding.outputtext.text=longresult.toString()
            }else{
                binding.outputtext.text=result.toString()

            }
        }

    }
}