object Transpose{
def rowToColumnStore(data: RDD[Vector]): RDD[(Int, Vector)]{

data.map(x => x.toArray).flatMap(x => x.zipWithIndex).map(x => x.swap).groupByKey.map(x => (x._1,x._2.toVector))

}

}

