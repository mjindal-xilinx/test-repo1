package com.ibm.icm.cluster_automation

class ClusterInfo implements Serializable {
    def steps;
    private String clusterName
    private int edgeNodeCount
    private int workerNodeCount

    ClusterInfo(def steps,String clusterName,int edgeNodeCount,int workerNodeCount) {
        this.steps = steps;
        this.clusterName = clusterName
        this.edgeNodeCount = edgeNodeCount
        this.workerNodeCount = workerNodeCount
    }

    void checkVars() {
        println "hello from method"
    }



}
























