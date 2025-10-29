# Coding Practice

## 📚 概要

このリポジトリは、プログラミングコンテストやアルゴリズム学習のための練習問題を管理するためのリポジトリです。LeetCode、AtCoder、Paizaなどの問題を解いたコードを整理・管理しています。

## 🎯 目的

- アルゴリズムとデータ構造の学習
- プログラミングコンテストの準備
- コードの品質向上とベストプラクティスの習得
- 問題解決能力の向上

## 📁 ディレクトリ構造

```
src/
├── leetcode/                     # LeetCode問題の解答
├── atcoder/                      # AtCoder問題の解答
└── paiza/                        # Paiza問題の解答
```

## 📝 命名規則

### ファイル命名規則
各問題の解答ファイルは以下の形式で命名しています：
- `YYYYMMDD.ts` - 解答日付（例：`20251028.ts`）

### ブランチ命名規則
ブランチは以下の形式で命名しています：
- `YYYYMMDD/...` - 作業日付（例：`20251025/leetcode-problem-26`）

## 🚀 使用方法

1. **リポジトリのクローン**
   ```bash
   git clone <repository-url>
   cd study.coding-practice
   ```

2. **問題の実行**
   ```bash
   # TypeScriptファイルの実行例
   npx ts-node src/leetcode/26_remove-duplicates-from-sorted-array/20251028.ts
   ```
