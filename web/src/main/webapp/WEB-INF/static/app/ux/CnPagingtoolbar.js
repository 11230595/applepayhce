/**
 * Created by peter on 2016/1/29.
 */
Ext.define('app.ux.CnPagingtoolbar', {
    extend : 'Ext.toolbar.Paging',
    alias : 'widget.cnPagingtoolbar',
    displayMsg:'当前显示记录 {0} - {1} 共计 {2}',
    emptyMsg: '没有记录可以显示',
    nextText:'下一页',
    afterPageText:'共 {0}',
    beforePageText:'页',
    firstText:'第一页',
    lastText:'最后一页',
    prevText:'前一页',
    refreshText:'刷新',
    initComponent: function() {
        var me = this
        me.callParent(arguments);
    }

})