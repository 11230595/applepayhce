Ext.define('app.view.content.VerifyOTP', {
    extend: 'Ext.form.Panel',
    alias: 'widget.verifyotp',
    id:'verifyotp',
    title:'verifyotp',
    closable : true,
    uses: ['app.ux.ToastFactory'],
    url: 'verifyotp',

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
        fieldLabel: 'OTP',
        name: 'otp'
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

