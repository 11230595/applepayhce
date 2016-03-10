Ext.define('app.view.content.InterfaceList',{
    extend:'Ext.panel.Panel',
    alias:'widget.interfacelist',
    uses: [
        'app.view.content.MappingNotify',
        'app.view.content.TriggerOTP',
        'app.view.content.VerifyOTP',
        'app.view.content.CupDPANOperationNotify',
        'app.view.content.GetStatus',
        'app.view.content.BankOprate'
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
                text:'mappingNotify',
                handler:function(btn){
                    var mappingnotify=Ext.getCmp('mappingnotify');
                    var tab=btn.up('interfacelist').down('tabpanel');
                    if(mappingnotify==null){
                        mappingnotify=Ext.create('app.view.content.MappingNotify');
                        tab.add(mappingnotify);
                        tab.setActiveTab(mappingnotify);
                    }else{
                        tab.setActiveTab(mappingnotify)
                    }
                }
            },{
                text:'triggerOTP',
                handler:function(btn){
                    var triggerotp=Ext.getCmp('triggerotp');
                    var tab=btn.up('interfacelist').down('tabpanel');
                    if(triggerotp==null){
                        triggerotp=Ext.create('app.view.content.TriggerOTP');
                        tab.add(triggerotp);
                        tab.setActiveTab(triggerotp);
                    }else{
                        tab.setActiveTab(triggerotp)
                    }
                }
            },{
                text:'verifyOTP',
                handler:function(btn){
                    var verifyotp=Ext.getCmp('verifyotp');
                    var tab=btn.up('interfacelist').down('tabpanel');
                    if(verifyotp==null){
                        verifyotp=Ext.create('app.view.content.VerifyOTP');
                        tab.add(verifyotp);
                        tab.setActiveTab(verifyotp);
                    }else{
                        tab.setActiveTab(verifyotp)
                    }
                }
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

        }, {
            title : '非银行客户端加载，银行客户端激活',
            html:'待补充'
        }, {
            title : '卡片生命周期管理',
            layout:'vbox',
            defaults:{
                xtype:'button',
                width:'100%'
            },
            items:[{
                text:'cupDPANOperationNotify',
                handler:function(btn){
                    var cupdpanoperationnotify=Ext.getCmp('cupdpanoperationnotify');
                    var tab=btn.up('interfacelist').down('tabpanel');
                    if(cupdpanoperationnotify==null){
                        cupdpanoperationnotify=Ext.create('app.view.content.CupDPANOperationNotify');
                        tab.add(cupdpanoperationnotify);
                        tab.setActiveTab(cupdpanoperationnotify);
                    }else{
                        tab.setActiveTab(cupdpanoperationnotify)
                    }
                }
            }]
        }, {
            title : '设备卡状态查询',
            layout:'vbox',
            defaults:{
                xtype:'button',
                width:'100%'
            },
            items:[{
                text:'getStatus',
                handler:function(btn){
                    var getStatus=Ext.getCmp('getStatus');
                    var tab=btn.up('interfacelist').down('tabpanel');
                    if(getStatus==null){
                        getStatus=Ext.create('app.view.content.GetStatus');
                        tab.add(getStatus);
                        tab.setActiveTab(getStatus);
                    }else{
                        tab.setActiveTab(getStatus)
                    }
                }
            }]
        }]
    }, {
        xtype : 'tabpanel',
        region : 'center'
    }]
});

