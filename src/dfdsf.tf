resource "aws_elasticache_replication_group" "default1"{
  replication_group_description = "Redis Cluster"
  engine                        = "redis"
  node_type                     = "cache.m4.large"
  number_cache_clusters         = 2
  transit_encryption_enabled    = false
}


resource "aws_elasticache_replication_group" "default2"{
  replication_group_description = "Redis Cluster"
  engine                        = "redis"
  node_type                     = "cache.m4.large"
  number_cache_clusters         = 2
  transit_encryption_enabled    = false
}

resource "aws_elasticache_replication_group" "default3"{
  replication_group_description = "Redis Cluster"
  engine                        = "redis"
  node_type                     = "cache.m4.large"
  number_cache_clusters         = 2
  transit_encryption_enabled    = true
}
