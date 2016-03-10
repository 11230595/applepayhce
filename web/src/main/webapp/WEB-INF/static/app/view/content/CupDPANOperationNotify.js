Ext.define('app.view.content.CupDPANOperationNotify', {
    extend: 'Ext.form.Panel',
    alias: 'widget.cupdpanoperationnotify',
    id:'cupdpanoperationnotify',
    title:'cupdpanoperationnotify',
    closable : true,
    uses: ['app.ux.ToastFactory'],
    url: 'cupdpanoperationnotify',

    padding:'20',
    // The fields
    defaultType: 'textfield',
    items: [{
        fieldLabel: 'DPAN ID',
        name: 'mpanid',
        allowBlank: false
    },{
        fieldLabel: 'seID',
        name: 'seid'
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


