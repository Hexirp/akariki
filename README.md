# akariki

[![Build Status](https://travis-ci.org/Hexirp/akariki.svg?branch=master)](https://travis-ci.org/Hexirp/akariki)

このMODはRedPowerの流れを汲んで集積回路やチューブを追加します！

## 導入

このリポジトリに入っているGradleラッパーを使って`build`タスクを実行してください。その結果`./build/libs/`にMODのjarファイルが生成されますのでそれを導入してください。残念ですが、開発途中なので簡単に導入することはできないです。

## 開発

Java 8が必要です。まず、このリポジトリをクローンしてください。その後に`setupDecompWorkspace`タスクを実行してください。これにはかなりのメモリが必要なので注意してください。

### IDEA

上が終わった後に、IntelliJ IDEAを起動してImport ProjectでGradleプロジェクトとしてインポートしてください。処理が全部終わったら一度プロジェクトを閉じて、`getIntelliJRuns`を実行してください。

### eclipse

`eclipse`タスクを実行した後にインポートしてください。

## ライセンス

(TODO)
