# cassandra-play-with-spring
## Cassandraの準備
### dockerを起動する
`docker-compose up -d`
### シェルを叩いて初期化する
`cassandra-init.sh`
### cqlsh起動
直接CQLを叩きたい場合は以下を実行する

`docker run -it -v `pwd`/cql:/home/cassandra --network swing-gen_default --rm cassandra cqlsh cassandra1`
