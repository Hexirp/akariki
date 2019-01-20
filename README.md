# akariki

[![Build Status](https://travis-ci.org/Hexirp/akariki.svg?branch=master)](https://travis-ci.org/Hexirp/akariki)

この MOD は RedPower2 の流れを汲んで集積回路やチューブを追加します！

## 導入

このリポジトリに入っている Gradle ラッパーを使って `build` タスクを実行して
ください。その結果 `./build/libs/` に MOD の jar ファイルが生成されますので
それを導入してください。開発途中なので jar ファイルは配布していません。

## 開発

事前に以下のことをやってください。

* JDK 8 をダウンロードして `JAVA_HOME` を設定する。
* Minecraft Java Edition 1.12.2 を起動しておく。

### 通常

まず、このリポジトリをクローンしてください。その後に `setupDecompWorkspace`
タスクを実行してください。これにはかなりのメモリが必要なので注意してください。

### IDEA

「通常」が終わった後、IntelliJ IDEA を起動して Import Project で Gradle
プロジェクトとしてインポートしてください。処理が全部終わったら一度
プロジェクトを閉じて、`getIntelliJRuns` タスクを実行してください。

### eclipse

「通常」が終わった後、`eclipse` タスクを実行して Eclipse からインポートして
ください。

## バージョン

[セマンティック・バージョニング](https://semver.org/lang/ja/)に従います。
これを MOD に適用するとこのようになると思われます。

* MAJOR - Minecraft や Forge のバージョンアップ、地形に関する追加や変更と削除、
  メカニズムの削除や変更
* MINOR - 新しいメカニズムの追加
* PATCH - バグ修正

## ライセンス

TODO
