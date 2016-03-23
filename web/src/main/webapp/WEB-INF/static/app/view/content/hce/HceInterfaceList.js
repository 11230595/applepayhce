Ext.define('app.view.content.hce.HceInterfaceList',{
    extend:'Ext.panel.Panel',
    alias:'widget.hceinterfacelist',
    uses: [
        'app.view.content.MappingNotify'
    ],
    layout : 'border',
    margin:'0 10 15 10',
    items : [{
        title : '接口列表',
        region : 'west',
        collapsible : true,
        split : true,
        width : 300,
        layout : 'accordion',
        header : {
            style : 'background-color : #f6f5ec'
        },
        items : [{
            title : '非银行客户端加载/激活',
            layout:'vbox',
            defaults:{
                xtype:'button',
                width:'100%'
            },
            items:[{
                text:'云卡申请',
                handler:function(btn){
                    var mappingnotify=Ext.getCmp('mappingnotify');
                    var tab=btn.up('hceinterfacelist').down('tabpanel');
                    if(mappingnotify==null){
                        mappingnotify=Ext.create('app.view.content.MappingNotify');
                        tab.add(mappingnotify);
                        tab.setActiveTab(mappingnotify);
                    }else{
                        tab.setActiveTab(mappingnotify)
                    }
                }
            },{
                text:'激活码申请'
            },{
                text:'云卡激活'
            },{
                text:'重装应用'
            },{
                text:'云卡注销'
            }]
        }, {
            title : '银行客户端加载/激活',
            layout:'vbox',
            defaults:{
                xtype:'button',
                width:'100%'
            },
            items:[{

                text:'bankOprate',
                handler:function(btn){
                    var bankoprate=Ext.getCmp('bankoprate');
                    var tab=btn.up('interfacelist').down('tabpanel');
                    if(bankoprate==null){
                        bankoprate=Ext.create('app.view.content.BankOprate');
                        tab.add(bankoprate);
                        tab.setActiveTab(bankoprate);
                    }else{
                        tab.setActiveTab(bankoprate)
                    }
                }
            }]

        }]
    }, {
        xtype : 'tabpanel',
        region : 'center'
    }]
});


