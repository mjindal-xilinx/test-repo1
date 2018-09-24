
import com.ibm.icm.cluster_automation.*

def call(String clusterName, int enCount, int wnCount){
    ClusterInfo clusterInfo = new ClusterInfo(this,clusterName, enCount, wnCount)
    println(clusterInfo.clusterName)
    println(clusterInfo.edgeNodeCount)
    println(clusterInfo.workerNodeCount)
}
// 67d7842dbbe25473c3c32b93c0da8047785f30d78e8a024de1b57352245f9689