# 看来大家都不用 windows 开发
./gradlew --quiet :shark:shark-cli:installDist
./shark/shark-cli/build/install/shark-cli/bin/shark-cli "$@"
