Ext.define('app.view.content.GetStatus', {
    extend: 'Ext.form.Panel',
    alias: 'widget.getStatus',
    id:'getStatus',
    title:'getStatus',
    closable : true,
    uses: ['app.ux.ToastFactory'],
    url: 'getStatus',

    padding:'20',
    // The fields
    defaultType: 'textfield',
    items: [{
        fieldLabel: 'DPAN ID',
        name: 'first',
        allowBlank: false
    },{
        fieldLabel: 'seID',
        name: 'cnv2'
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

