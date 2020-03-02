# BrowserApp01
＜アプリ名＞Webブラウザテスト１
＜機能＞Web検索のためにgoogleを表示とタイトルバーの表示変更
＜技術＞
⑴WebViewクラス　簡易的なブラウザ機能
　・WebSettingsクラス　WebView詳細設定としてJavaScriptを指定
　・WebViewClientクラス　イベント検出　ロード中にトースト表示
　・WebChromeClientクラス　UIに影響があった時に呼ばれる
⑵ActionBarクラス　タイトルバーに取って代わるActivity部品
　・オプションメニューを表示
　・タイトルを設定