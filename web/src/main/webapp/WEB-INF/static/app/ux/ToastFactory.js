Ext.define('app.ux.ToastFactory', {
    statics : {
        getToast: function (title, msg) {
            return Ext.toast({
                title : title,
                html : msg,
                bodyStyle : 'background-color:#7bbfea;',
                header : {
                    border : 1,
                    style : {
                        borderColor : '#9b95c9'
                    }
                },
                border : true,
                style : {
                    borderColor : '#9b95c9'
                },
                saveDelay : 10,
                align : 'tr',
                closable : true,
                minWidth : 200,
                useXAxis : true,
                slideInDuration : 500
            });
        }
    }


});
