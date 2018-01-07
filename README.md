# akariki

[![Build Status](https://travis-ci.org/Hexirp/akariki.svg?branch=master)](https://travis-ci.org/Hexirp/akariki)

このMODはRedPower2の流れを汲んで集積回路やチューブを追加します！

## 導入

このリポジトリに入っているGradleラッパーを使って`build`タスクを実行してください。その結果`./build/libs/`にMODのjarファイルが生成されますのでそれを導入してください。残念ですが開発途中なので簡単に導入することはできません。

## 開発

事前に以下のことをやってください。

* JDK 8をダウンロードして`JAVA_HOME`を設定する。
* Minecraft Java Editionのバージョン1.12.2を起動しておく。

### 通常

まず、このリポジトリをクローンしてください。その後に`setupDecompWorkspace`タスクを実行してください。これにはかなりのメモリが必要なので注意してください。

### IDEA

「通常」が終わった後、IntelliJ IDEAを起動してImport ProjectでGradleプロジェクトとしてインポートしてください。処理が全部終わったら一度プロジェクトを閉じて、`getIntelliJRuns`タスクを実行してください。

### eclipse

「通常」が終わった後、`eclipse`タスクを実行してEclipseからインポートしてください。

## ライセンス

(TODO)
