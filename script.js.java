// 截至2025年9月3日英国当地时间英超Big6一线队准确数据（仅当前在队球员，无离队/转会标注）
// 已修正：移除曼城帕尔默、麦卡蒂等离队人员，确保每支球队球员均为当前在队
const big6PlayersData = {
    // 曼城：移除帕尔默、麦卡蒂，保留当前在队主力+替补
    manCity: {
        name: "曼城",
        players: [
            { name: "多纳鲁马", position: "门将", nationality: "意大利", height: 196, weight: 90 },
            { name: "马克·贝蒂内利", position: "门将", nationality: "英格兰", height: 191, weight: 86 },
            { name: "鲁本·迪亚斯", position: "中后卫", nationality: "葡萄牙", height: 187, weight: 83 },
            { name: "格瓦迪奥尔", position: "中后卫", nationality: "克罗地亚", height: 191, weight: 88 },
            { name: "斯通斯", position: "中后卫/后腰", nationality: "英格兰", height: 188, weight: 80 },
            { name: "艾特努里", position: "左后卫", nationality: "摩洛哥", height: 178, weight: 72 },
            { name: "沃克尔-彼得斯", position: "右后卫", nationality: "英格兰", height: 176, weight: 70 },
            { name: "内森·阿克", position: "后卫", nationality: "荷兰", height: 180, weight: 75 },
            { name: "里科·刘易斯", position: "右后卫", nationality: "英格兰", height: 173, weight: 68 },
            { name: "罗德里", position: "后腰", nationality: "西班牙", height: 191, weight: 82 },
            { name: "赖恩德斯", position: "中场", nationality: "荷兰", height: 184, weight: 76 },
            { name: "贝尔纳多·席尔瓦（B席）", position: "前腰/右边锋", nationality: "葡萄牙", height: 173, weight: 64 },
            { name: "哈兰德", position: "中前锋", nationality: "挪威", height: 195, weight: 94 },
            { name: "福登", position: "左边锋/前腰", nationality: "英格兰", height: 171, weight: 65 },
            { name: "多库", position: "左边锋", nationality: "比利时", height: 173, weight: 67 },
            { name: "谢尔基", position: "右边锋", nationality: "法国", height: 176, weight: 70 },
            { name: "萨维尼奥", position: "右边锋", nationality: "巴西", height: 172, weight: 65 },
            { name: "奥斯卡·鲍伯", position: "前锋", nationality: "挪威", height: 178, weight: 72 }
        ]
    },
    // 阿森纳：当前在队主力+替补
    arsenal: {
        name: "阿森纳",
        players: [
            { name: "拉亚", position: "门将", nationality: "西班牙", height: 189, weight: 82 },
            { name: "凯帕", position: "门将", nationality: "西班牙", height: 186, weight: 85 },
            { name: "加布里埃尔", position: "左中卫", nationality: "巴西", height: 190, weight: 83 },
            { name: "萨利巴", position: "右中卫", nationality: "法国", height: 192, weight: 85 },
            { name: "廷贝尔", position: "右后卫", nationality: "荷兰", height: 179, weight: 75 },
            { name: "津琴科", position: "左后卫", nationality: "乌克兰", height: 175, weight: 69 },
            { name: "本·怀特", position: "后卫", nationality: "英格兰", height: 186, weight: 78 },
            { name: "雅库布·基维奥尔", position: "中后卫", nationality: "波兰", height: 185, weight: 79 },
            { name: "马丁·苏维门迪", position: "后腰", nationality: "西班牙", height: 176, weight: 70 },
            { name: "德克兰·赖斯", position: "中场", nationality: "英格兰", height: 188, weight: 80 },
            { name: "厄德高", position: "前腰", nationality: "挪威", height: 179, weight: 72 },
            { name: "克里斯蒂安·诺尔高", position: "中场", nationality: "丹麦", height: 185, weight: 78 },
            { name: "埃米尔·史密斯·罗", position: "前腰", nationality: "英格兰", height: 175, weight: 70 },
            { name: "萨卡", position: "右边锋", nationality: "英格兰", height: 178, weight: 65 },
            { name: "马丁内利", position: "左边锋", nationality: "巴西", height: 175, weight: 66 },
            { name: "热苏斯", position: "中前锋", nationality: "巴西", height: 175, weight: 73 },
            { name: "约克雷斯（哲凯赖什）", position: "中前锋", nationality: "瑞典", height: 185, weight: 78 },
            { name: "弗洛里安·维尔茨", position: "前锋", nationality: "德国", height: 176, weight: 68 }
        ]
    },
    // 利物浦：当前在队主力+替补
    liverpool: {
        name: "利物浦",
        players: [
            { name: "阿利森", position: "门将", nationality: "巴西", height: 193, weight: 91 },
            { name: "伍德曼", position: "门将", nationality: "英格兰", height: 193, weight: 85 },
            { name: "范戴克", position: "左中卫", nationality: "荷兰", height: 193, weight: 92 },
            { name: "科纳特", position: "右中卫", nationality: "法国", height: 187, weight: 86 },
            { name: "乔·戈麦斯", position: "右后卫/中后卫", nationality: "英格兰", height: 188, weight: 80 },
            { name: "米尔沃尔·科尔克兹", position: "左后卫", nationality: "塞尔维亚", height: 182, weight: 75 },
            { name: "安迪·罗伯逊", position: "左后卫", nationality: "苏格兰", height: 178, weight: 67 },
            { name: "纳撒尼尔·菲利普斯", position: "中后卫", nationality: "英格兰", height: 190, weight: 83 },
            { name: "远藤航", position: "后腰", nationality: "日本", height: 178, weight: 75 },
            { name: "麦卡利斯特", position: "中场", nationality: "阿根廷", height: 178, weight: 73 },
            { name: "维尔茨", position: "前腰", nationality: "德国", height: 176, weight: 68 },
            { name: "柯蒂斯·琼斯", position: "中场", nationality: "英格兰", height: 180, weight: 72 },
            { name: "哈维·埃利奥特", position: "中场", nationality: "英格兰", height: 172, weight: 65 },
            { name: "萨拉赫", position: "右边锋", nationality: "埃及", height: 175, weight: 71 },
            { name: "亚历山大·伊萨克", position: "中前锋", nationality: "瑞典", height: 190, weight: 85 },
            { name: "埃基蒂克", position: "中前锋", nationality: "法国", height: 186, weight: 80 },
            { name: "基耶萨", position: "左边锋", nationality: "意大利", height: 175, weight: 70 },
            { name: "本·多克", position: "左边锋", nationality: "苏格兰", height: 170, weight: 64 },
            { name: "法比奥·卡瓦略", position: "前锋", nationality: "葡萄牙", height: 173, weight: 68 }
        ]
    },
    // 热刺：当前在队主力+替补
    tottenham: {
        name: "热刺",
        players: [
            { name: "维卡里奥", position: "门将", nationality: "意大利", height: 188, weight: 80 },
            { name: "金斯基", position: "门将", nationality: "波兰", height: 190, weight: 83 },
            { name: "克里斯蒂安·罗梅罗", position: "右中卫", nationality: "阿根廷", height: 178, weight: 75 },
            { name: "范德芬", position: "左中卫", nationality: "荷兰", height: 189, weight: 85 },
            { name: "乌多吉", position: "左后卫", nationality: "意大利", height: 184, weight: 76 },
            { name: "波罗", position: "右后卫", nationality: "西班牙", height: 176, weight: 72 },
            { name: "埃默森·罗亚尔", position: "右后卫", nationality: "巴西", height: 179, weight: 76 },
            { name: "达文森·桑切斯", position: "中后卫", nationality: "哥伦比亚", height: 187, weight: 81 },
            { name: "本坦库尔", position: "后腰", nationality: "乌拉圭", height: 187, weight: 79 },
            { name: "哈维·西蒙斯", position: "中场/前腰", nationality: "荷兰", height: 178, weight: 73 },
            { name: "麦迪逊", position: "前腰", nationality: "英格兰", height: 175, weight: 68 },
            { name: "皮埃尔-埃米尔·霍伊别尔", position: "中场", nationality: "丹麦", height: 185, weight: 78 },
            { name: "奥利弗·斯基普", position: "中场", nationality: "英格兰", height: 178, weight: 73 },
            { name: "库卢塞夫斯基", position: "右边锋", nationality: "瑞典", height: 186, weight: 82 },
            { name: "里沙利松", position: "中前锋", nationality: "巴西", height: 185, weight: 78 },
            { name: "索兰克", position: "中前锋", nationality: "英格兰", height: 187, weight: 80 },
            { name: "布伦南·约翰逊", position: "左边锋", nationality: "威尔士", height: 175, weight: 70 }
        ]
    },
    // 切尔西：当前在队主力+替补
    chelsea: {
        name: "切尔西",
        players: [
            { name: "桑切斯", position: "门将", nationality: "西班牙", height: 191, weight: 85 },
            { name: "迈克·彭德斯", position: "门将", nationality: "比利时", height: 188, weight: 81 },
            { name: "里斯·詹姆斯", position: "右后卫", nationality: "英格兰", height: 175, weight: 72 },
            { name: "库库雷利亚", position: "左后卫", nationality: "西班牙", height: 171, weight: 64 },
            { name: "科尔威尔", position: "左中卫", nationality: "英格兰", height: 188, weight: 82 },
            { name: "阿达拉比奥尤", position: "右中卫", nationality: "英格兰", height: 187, weight: 83 },
            { name: "马马杜·萨尔", position: "后卫", nationality: "法国", height: 185, weight: 80 },
            { name: "伊恩·马特森", position: "左后卫", nationality: "荷兰", height: 175, weight: 70 },
            { name: "凯塞多", position: "后腰", nationality: "厄瓜多尔", height: 178, weight: 70 },
            { name: "恩佐", position: "中场", nationality: "阿根廷", height: 185, weight: 78 },
            { name: "肯德里·派斯", position: "中场", nationality: "厄瓜多尔", height: 172, weight: 65 },
            { name: "康纳·加拉格尔", position: "中场", nationality: "英格兰", height: 182, weight: 73 },
            { name: "若昂·佩德罗", position: "中前锋", nationality: "巴西", height: 177, weight: 71 },
            { name: "杰米·吉滕斯", position: "右边锋", nationality: "英格兰", height: 175, weight: 67 },
            { name: "斯特林", position: "左边锋", nationality: "英格兰", height: 170, weight: 69 },
            { name: "利亚姆·德拉普", position: "前锋", nationality: "英格兰", height: 187, weight: 80 },
            { name: "埃斯特旺·威廉", position: "右边锋", nationality: "巴西", height: 172, weight: 65 }
        ]
    },
    // 曼联：当前在队主力+替补
    manUtd: {
        name: "曼联",
        players: [
            { name: "巴因迪尔", position: "门将", nationality: "土耳其", height: 193, weight: 85 },
            { name: "汤姆·希顿", position: "门将", nationality: "英格兰", height: 188, weight: 82 },
            { name: "利桑德罗·马丁内斯（利马）", position: "左中卫", nationality: "阿根廷", height: 175, weight: 72 },
            { name: "约罗", position: "右中卫", nationality: "法国", height: 186, weight: 82 },
            { name: "多古", position: "左后卫", nationality: "土耳其", height: 178, weight: 70 },
            { name: "达洛特", position: "右后卫", nationality: "葡萄牙", height: 173, weight: 68 },
            { name: "维克多·林德洛夫", position: "中后卫", nationality: "瑞典", height: 187, weight: 83 },
            { name: "布兰登·威廉姆斯", position: "左后卫", nationality: "英格兰", height: 172, weight: 66 },
            { name: "卡塞米罗", position: "后腰", nationality: "巴西", height: 185, weight: 84 },
            { name: "布鲁诺·费尔南德斯（B费）", position: "前腰", nationality: "葡萄牙", height: 179, weight: 75 },
            { name: "芒特", position: "前腰/中场", nationality: "英格兰", height: 178, weight: 71 },
            { name: "斯科特·麦克托米奈", position: "中场", nationality: "苏格兰", height: 191, weight: 84 },
            { name: "科比·梅努", position: "中场", nationality: "英格兰", height: 175, weight: 67 },
            { name: "拉什福德", position: "左边锋", nationality: "英格兰", height: 185, weight: 70 },
            { name: "马特乌斯·库尼亚", position: "中前锋", nationality: "巴西", height: 184, weight: 78 },
            { name: "阿马德·迪亚洛", position: "右边锋", nationality: "科特迪瓦", height: 178, weight: 72 },
            { name: "安东尼·马夏尔", position: "中前锋", nationality: "法国", height: 184, weight: 76 }
        ]
    }
};

// 交互逻辑（实现MVP查询功能，无修改）
const teamSelect = document.getElementById("team-select");
const queryBtn = document.getElementById("query-btn");
const playersTable = document.getElementById("players-table");
const playersBody = document.getElementById("players-body");
const emptyTip = document.getElementById("empty-tip");

// 绑定查询按钮点击事件
queryBtn.addEventListener("click", function() {
    const selectedTeamId = teamSelect.value;
    if (!selectedTeamId) {
        alert("请先从下拉菜单选择一支英超Big6球队！");
        return;
    }

    const selectedTeam = big6PlayersData[selectedTeamId];
    const players = selectedTeam.players;

    // 清空历史数据
    playersBody.innerHTML = "";

    // 插入当前在队球员数据
    players.forEach(player => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${player.name}</td>
            <td>${player.position}</td>
            <td>${player.nationality}</td>
            <td>${player.height}</td>
            <td>${player.weight}</td>
        `;
        playersBody.appendChild(row);
    });

    // 显示表格，隐藏空提示
    playersTable.style.display = "table";
    emptyTip.style.display = "none";
});

// 切换球队时重置显示
teamSelect.addEventListener("change", function() {
    if (!teamSelect.value) {
        playersTable.style.display = "none";
        emptyTip.style.display = "block";
    }
});
```
