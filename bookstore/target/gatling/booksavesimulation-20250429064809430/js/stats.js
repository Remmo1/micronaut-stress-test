var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "66300",
        "ok": "62940",
        "ko": "3360"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "1",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "64",
        "ok": "64",
        "ko": "9"
    },
    "meanResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "1"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "1"
    },
    "percentiles1": {
        "total": "1",
        "ok": "1",
        "ko": "1"
    },
    "percentiles2": {
        "total": "2",
        "ok": "2",
        "ko": "1"
    },
    "percentiles3": {
        "total": "2",
        "ok": "2",
        "ko": "1"
    },
    "percentiles4": {
        "total": "5",
        "ok": "5",
        "ko": "3"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 62940,
    "percentage": 95
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 3360,
    "percentage": 5
},
    "meanNumberOfRequestsPerSecond": {
        "total": "92.083",
        "ok": "87.417",
        "ko": "4.667"
    }
},
contents: {
"req_create-book-56e35": {
        type: "REQUEST",
        name: "create-book",
path: "create-book",
pathFormatted: "req_create-book-56e35",
stats: {
    "name": "create-book",
    "numberOfRequests": {
        "total": "66300",
        "ok": "62940",
        "ko": "3360"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "1",
        "ko": "0"
    },
    "maxResponseTime": {
        "total": "64",
        "ok": "64",
        "ko": "9"
    },
    "meanResponseTime": {
        "total": "2",
        "ok": "2",
        "ko": "1"
    },
    "standardDeviation": {
        "total": "1",
        "ok": "1",
        "ko": "1"
    },
    "percentiles1": {
        "total": "1",
        "ok": "1",
        "ko": "1"
    },
    "percentiles2": {
        "total": "2",
        "ok": "2",
        "ko": "1"
    },
    "percentiles3": {
        "total": "2",
        "ok": "2",
        "ko": "1"
    },
    "percentiles4": {
        "total": "5",
        "ok": "5",
        "ko": "3"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 62940,
    "percentage": 95
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 3360,
    "percentage": 5
},
    "meanNumberOfRequestsPerSecond": {
        "total": "92.083",
        "ok": "87.417",
        "ko": "4.667"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
