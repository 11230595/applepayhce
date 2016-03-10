/**
 * Created by peter on 2016/1/28.
 */
Ext.define('app.store.AppErrorTab', {
    extend:'Ext.data.Store',
    autoLoad: false,
    pageSize:25,
    model: 'app.model.AppErrorTab',
    remoteSort:true,
    proxy: {
        type: 'ajax',
        actionMethods: {
            read:'POST'
        },
        api:{
            read:'appErrorTab/queryByPage',
        },
        reader: {
            type: 'json',
            rootProperty: 'items',
            totalProperty:"total"
        }
    },
    listeners:{
        beforeload:function(store){

        }
    }
});