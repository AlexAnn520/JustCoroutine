package com.example.justcoroutine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var taskAdapter: TaskAdapter

    // 模拟任务数据
    private val taskList = listOf(
        Task(1, "完成项目计划", "制定详细的项目计划和时间表"),
        Task(2, "学习 Kotlin 协程", "掌握 Kotlin 协程的基本概念和用法"),
        Task(3, "实现用户界面", "根据设计稿实现应用的用户界面"),
        Task(4, "编写单元测试", "为核心功能编写单元测试"),
        Task(5, "性能优化", "识别并解决应用中的性能问题"),
        Task(6, "准备发布", "准备应用发布所需的材料和配置")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textGreeting: TextView = findViewById(R.id.textGreeting)
        textGreeting.text = "任务列表"

        // 设置 RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 设置适配器
        taskAdapter = TaskAdapter(taskList)
        recyclerView.adapter = taskAdapter
    }
}