package com.example.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
import com.example.recyclerview.ui.adapter.BlogPostRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogPostAdapter: BlogPostRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initRecyclerview()
    }

    private fun initRecyclerview() {
        rvBlogPost.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            blogPostAdapter = BlogPostRecyclerAdapter(com.example.recyclerview.data.DataSource.createDataSet())
            adapter = blogPostAdapter
        }
    }
}
