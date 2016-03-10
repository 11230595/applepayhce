/**
 * Created by PETER on 2015/6/3.
 */
Ext.Loader.setConfig({
    enabled: true,
    disableCaching: true
});

Ext.application({
    name:'app',
    appFolder:'app',
    requires: [
        //'app.store.Stock',
        //'app.store.Subscribe'
    ],
    views: [
        'MainPage'
    ],
    controllers: [
  	    'MainController'
  	],
    glyphFontFamily: 'FontAwesome',

    autoCreateViewport:'MainPage',

    launch:function(){
        Ext.QuickTips.init();
        Ext.Ajax.setTimeout(60000);

    }
});
