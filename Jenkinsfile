
@Library('icm-cluster-provision')
import com.ibm.icm.cluster_automation.*

properties([
    parameters([
        string(defaultValue: '', description: 'Cluster Will be created with this name.', name: 'ClusterName'),
        string(defaultValue: '', description: 'The Functional Id or the APIKey for the cluster', name: 'APIKey'),
        choice(choices: 'jp-tok\nau-syd\neu-de\neu-gb\nus-east\nus-south', description: '', name: 'Region'),
        string(defaultValue: '', description: '''Set the region in which you want to create the cluster using the command `bx cs region-set <region-name>`
                    and you can select the available locations from the list by running the command `bx cs locations`''', name: 'Location'),
        string(defaultValue: '', description: 'Select the machine types available in the location by running the command `bx cs machine-types <location>`', name: 'MachineType'),
        string(defaultValue: '', description: 'Select the kube version from the available versions from the command `bx cs kube-versions` ', name: 'KubeVersion'),
        string(defaultValue: '', description: '', name: 'EdgeNodesCount'),
        string(defaultValue: '', description: '', name: 'WorkerNodeCount'),
        string(defaultValue: '', description: '', name: 'VlanPrivate'),
        string(defaultValue: '', description: '', name: 'VlanPublic')
    ])
])



node {
    int enCount = EdgeNodesCount.toInteger()
    int wnCount = WorkerNodeCount.toInteger()
    checkout scm
    def clusterInfo = new ClusterInfo(this,ClusterName,enCount,wnCount);
    println(clusterInfo.clusterName)
    println(clusterInfo.edgeNodeCount)
    println(clusterInfo.workerNodeCount)
    //icmCreateCluster(ClusterName,enCount,wnCount)
    println("--1--")
    sh 'ls -l'
    println("--2--")
    withCredentials([usernamePassword(credentialsId: 'gitlab', passwordVariable: 'PASS', usernameVariable: 'USER')]) {

       // sh "./test.sh"
    }

}
