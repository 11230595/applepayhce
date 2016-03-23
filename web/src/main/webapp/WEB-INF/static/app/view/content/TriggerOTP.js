Ext.define('app.view.content.TriggerOTP', {
    extend: 'Ext.form.Panel',
    alias: 'widget.triggerotp',
    id:'triggerotp',
    title:'triggerotp',
    closable : true,
    uses: [
        'app.ux.ToastFactory',

    ],
    url: 'triggerotp',

    padding:'20',
    // The fields
    defaultType: 'textfield',
    items: [{
        fieldLabel: 'DPAN ID',
        name: 'mpan',
        allowBlank: false
    },{
        fieldLabel: 'seID',
        name: 'seid'
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

                        app.ux.ToastFactory.getToast('Success',action.result.message);
                        if(action.result.content!=null){
                            var otp="手机激活码为 "+action.result.content;
                            Ext.Msg.alert('result', otp);
                        }
                    },
                    failure: function(form, action) {
                        app.ux.ToastFactory.getToast('Failed',action.result.message)
                    }
                });
            }
        }
    }]
})
