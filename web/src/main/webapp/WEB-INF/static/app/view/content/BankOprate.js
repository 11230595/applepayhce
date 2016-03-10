/**
 * Created by liuyufu on 2016/3/8.
 */
Ext.define('app.view.content.BankOprate', {
    extend: 'Ext.form.Panel',
    alias: 'widget.bankoprate',
    id:'bankoprate',
    title:'bankoprate',
    closable : true,
    uses: ['app.ux.ToastFactory'],
    url: 'bankoprate',

    padding:'20',
    // The fields
    defaultType: 'textfield',
    items: [{
        fieldLabel: '卡号',
        name: 'cardNo',
        allowBlank: false
    },{
        fieldLabel: '操作',
        xtype:'combobox',
        editable:false,
        store:Ext.create('Ext.data.Store', {
            fields: ['abbr', 'name'],
            data : [
                {"abbr":"02", "name":"挂失"},
                {"abbr":"01", "name":"解挂"},
                {"abbr":"03", "name":"注销"}
            ]
        }),
        queryMode: 'local',
        displayField: 'name',
        valueField: 'abbr',
        name: 'operation'
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
