/**
 * Created by peter on 2016/1/28.
 */
Ext.define('app.model.AppErrorTab', {
    extend: 'Ext.data.Model',
    idProperty: 'seId'+'span',
    fields: [
        {name: 'seId',  type: 'string'},
        {name: 'span',  type: 'string'},
        {name: 'applyExceptionResult', type: 'string'},
        {name: 'exceptionResultReason', type: 'string'},
        {name: 'applyChannel', type: 'string'}
    ]
});