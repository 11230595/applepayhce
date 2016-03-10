/**
 * Created by PETER on 2015/6/4.
 */
Ext.define('app.view.MainPage', {
    extend: 'Ext.container.Viewport',
    alias: 'widget.mainPage',
    uses: [
        'app.view.region.MainTop',
        'app.view.MainModel',
        'app.view.content.InterfaceList'
    ],
    viewModel: {
        type: 'main'
    },
    layout: 'border',
    minWidth: 1200,
    minHeight: 600,

    items: [
        {
            xtype:'mainTop',
		    region:'north'
        },
        {
            xtype:'interfacelist',
            region:'center'
        }
    ],
    initComponent : function() {
        this.callParent(arguments);
    }
});