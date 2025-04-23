# Java Silver 17 Project

このプロジェクトは、Java Silver SE 17（オラクル認定Javaプログラマ試験 Silver SE 17）対策用の学習リポジトリです。

## ディレクトリ構成

- `src/main/java/` : Javaのメインソースコード
- `src/test/` : テスト用コード
- `lib/` : 追加ライブラリ（必要に応じて配置）
- `target/` : ビルド成果物（自動生成）

## 主な内容

- Javaの基礎文法、オブジェクト指向、例外処理、コレクションAPIなど、Silver試験範囲のサンプルコード
- 各チャプターごとにパッケージ分割
- 練習問題や解説コメント付き

## ビルド・実行方法

本プロジェクトは標準のJavaコンパイラ（javac）でビルドできます。MavenやGradleのビルドファイルは含まれていません。

### コンパイル例
```sh
javac -d ./target src/main/java/com/example/javasilver17/purple/chapter1/hello.java
```

### 実行例
```sh
java -cp ./target com.example.javasilver17.purple.chapter1.Hello
```

## 注意事項

- Java 17以上のJDKが必要です。
- コードやディレクトリ構成は学習用途に最適化されています。

---

# Java Silver 17 Learning Repository (English)

This repository is for learning and practicing for the Oracle Certified Java Programmer Silver SE 17 exam.

## Structure
- `src/main/java/` : Main Java source code
- `src/test/` : Test code
- `lib/` : Additional libraries (if needed)
- `target/` : Build artifacts (auto-generated)

## Main Contents
- Sample code for Java basics, OOP, exceptions, collections, etc. (all Silver exam topics)
- Organized by chapter/package
- Practice problems and comments included

## Build & Run

You can build this project using the standard Java compiler (`javac`). No Maven/Gradle build files are included.

### Example Compile
```sh
javac -d ./target src/main/java/com/example/javasilver17/purple/chapter1/hello.java
```

### Example Run
```sh
java -cp ./target com.example.javasilver17.purple.chapter1.Hello
```

## Notes
- Requires JDK 17 or higher
- The code and structure are optimized for learning purposes
