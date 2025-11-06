<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>英超Big6球员信息查询（2025/9/3最新版）</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>英超Big6球队一线队球员信息查询系统</h1>
        <!-- 球队选择区域 -->
        <div class="select-area">
            <label for="team-select">选择球队：</label>
            <select id="team-select">
                <option value="">--请选择英超Big6球队--</option>
                <option value="manCity">曼城</option>
                <option value="arsenal">阿森纳</option>
                <option value="liverpool">利物浦</option>
                <option value="tottenham">热刺</option>
                <option value="chelsea">切尔西</option>
                <option value="manUtd">曼联</option>
            </select>
            <button id="query-btn">查询球员信息</button>
        </div>
        <!-- 球员信息展示区域 -->
        <div class="result-area">
            <table id="players-table" border="1">
                <thead>
                    <tr>
                        <th>球员姓名</th>
                        <th>场上位置</th>
                        <th>国籍</th>
                        <th>身高（cm）</th>
                        <th>体重（kg）</th>
                    </tr>
                </thead>
                <tbody id="players-body"></tbody>
            </table>
            <p id="empty-tip">请选择球队并点击查询按钮</p>
        </div>
        <!-- 数据说明（对标MVP功能） -->
        <div class="data-note">
            <p>数据截止时间：2025年9月3日（英国当地时间）| 仅展示当前在队球员</p>
        </div>
    </div>
    <script src="script.js"></script>
</body>
</html>
```
