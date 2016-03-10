Ext.define('app.view.content.MappingNotify', {
    extend: 'Ext.form.Panel',
    alias: 'widget.mappingnotify',
    id:'mappingnotify',
    title:'mappingnotify',
    closable : true,
    uses: ['app.ux.ToastFactory'],
    url: 'mappingnotify',
    padding:'20',
    // The fields
    defaultType: 'textfield',
    items: [{
        fieldLabel: '银行卡号',
        name: 'cardNo',
        allowBlank: false
    },{
        fieldLabel: 'CVN2:',
        name: 'cnv2'
    },{
        fieldLabel: '有效期',
        name: 'last'
    },{
        xtype      : 'fieldcontainer',
        fieldLabel : 'appId',
        defaultType: 'radiofield',
        defaults: {
            flex: 1
        },
        layout: 'hbox',
        items: [
            {
                boxLabel  : '借记卡',
                name      : 'size',
                inputValue: 'm',
                value:'true'
            }, {
                boxLabel  : '贷记卡',
                name      : 'size',
                inputValue: 'l'
            }
        ]
    }, {
        xtype      : 'fieldcontainer',
        fieldLabel : '设备语言',
        defaultType: 'radiofield',
        defaults: {
            flex: 1
        },
        layout: 'hbox',
        items: [
            {
                boxLabel  : '英文',
                name      : 'size',
                inputValue: 'm'
            }, {
                boxLabel  : '中文',
                name      : 'size',
                inputValue: 'l',
                value:'true'
            }
        ]
    },{
        xtype      : 'fieldcontainer',
        fieldLabel : '脚本执行结果',
        defaultType: 'radiofield',
        defaults: {
            flex: 1
        },
        layout: 'hbox',
        items: [
            {
                boxLabel  : '求成功',
                name      : 'size',
                inputValue: 'm',
                value:'true'
            }, {
                boxLabel  : '求失败',
                name      : 'size',
                inputValue: 'l'
            }
        ]
    },{
        fieldLabel: 'seID',
        name: 'seid',
        maxLength:64
    },{
        xtype:'fieldset',
        title: '个人化风险要素录入',
        collapsible: true,
        defaultType: 'textfield',
        layout: 'anchor',
        items :[{
            fieldLabel: '设备类型',
            xtype:'combobox',
            editable:false,
            store:Ext.create('Ext.data.Store', {
                fields: ['abbr', 'name'],
                data : [
                    {"abbr":"01", "name":"iphone"},
                    {"abbr":"02", "name":"ipad"},
                    {"abbr":"03", "name":"iwatch"}
                ]
            }),
            queryMode: 'local',
            displayField: 'name',
            valueField: 'abbr',
            value:'iphone',
            name: 'operation'
        },{
            fieldLabel: '设备号码',
            name:'phone',
            value:'1234'
        },{
            fieldLabel: '地理位置',
            name:'phone',
            value:'37/-121'
        },{
            fieldLabel: '账户评分',
            xtype:'combobox',
            editable:false,
            store:Ext.create('Ext.data.Store', {
                fields: ['abbr', 'name'],
                data : [
                    {"abbr":"01", "name":"1"},
                    {"abbr":"02", "name":"2"},
                    {"abbr":"03", "name":"3"},
                    {"abbr":"04", "name":"4"},
                    {"abbr":"05", "name":"5"}
                ]
            }),
            queryMode: 'local',
            displayField: 'name',
            valueField: 'abbr',
            value:'5',
            name: 'operation'
        },{
            fieldLabel: '设备评分',
            xtype:'combobox',
            editable:false,
            store:Ext.create('Ext.data.Store', {
                fields: ['abbr', 'name'],
                data : [
                    {"abbr":"01", "name":"1"},
                    {"abbr":"02", "name":"2"},
                    {"abbr":"03", "name":"3"},
                    {"abbr":"04", "name":"4"},
                    {"abbr":"05", "name":"5"}
                ]
            }),
            queryMode: 'local',
            displayField: 'name',
            valueField: 'abbr',
            value:'5',
            name: 'operation'
        },{
            fieldLabel: '加载环节评分',
            xtype:'combobox',
            editable:false,
            store:Ext.create('Ext.data.Store', {
                fields: ['abbr', 'name'],
                data : [
                    {"abbr":"01", "name":"Green"},
                    {"abbr":"02", "name":"Yellow"},
                    {"abbr":"03", "name":"Orange"},
                    {"abbr":"04", "name":"Red"}
                ]
            }),
            queryMode: 'local',
            displayField: 'name',
            valueField: 'abbr',
            value:'Green',
            name: 'operation'
        },{
            fieldLabel: '流程颜色',
            name:'phone',
            value:'01,02,03,04'
        }]
    }],



    buttons: [{
        text: 'Reset',
        handler: function() {
            this.up('form').getForm().reset();
        }
    }, {
        text: 'Submit',
        handler: function() {
            var form = this.up('form').getForm();
            if (form.isValid()) {
                form.submit({
                    success: function(form, action) {
                        app.ux.ToastFactory.getToast('Success',action.result.message)

                    },
                    failure: function(form, action) {
                        app.ux.ToastFactory.getToast('Failed',action.result.message)
                    }
                });
            }
        }
    }]
})