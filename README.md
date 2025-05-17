# JustCoroutine - 任务列表应用

这是一个简单的任务列表 Android 应用，使用 Kotlin 和传统 XML 布局构建。

## 项目特点

- 使用 Kotlin 开发
- 采用传统 XML 布局，遵循 Android 最佳实践
- 使用 RecyclerView 展示任务列表
- 使用 CardView 为列表项提供美观样式

## 项目结构

- `MainActivity.kt`: 应用的主界面，包含任务列表
- `Task.kt`: 任务数据模型
- `TaskAdapter.kt`: RecyclerView 适配器
- XML 布局文件: 
  - `activity_main.xml`: 主界面布局
  - `item_task.xml`: 任务列表项的布局

## 未来计划

- 添加任务增删改功能
- 实现数据持久化
- 添加任务优先级和截止日期功能
- 使用 Kotlin 协程进行异步操作
