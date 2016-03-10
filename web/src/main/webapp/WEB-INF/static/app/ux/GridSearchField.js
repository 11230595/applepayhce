/**
 * Created by PETER on 2015/6/4.
 */
Ext.define('app.ux.GridSearchField', {
	extend : 'Ext.form.field.Text',
	alias : 'widget.gridsearchfield',
	focusWidth : 120,
	blurWidth : 60,
	listeners : {
		focus : function(field) {
			field.getEl().animate({
				to : {
					width : field.focusWidth
				},
				listeners : {
					afteranimate : function() {
						field.setWidth(field.focusWidth);
						//field.ownerCt.doLayout();
					}
				}
			})
		},
		blur : function(field) {
			if (field.getValue().length == 0)
				field.getEl().animate({
					to : {
						width : field.blurWidth
					},
					listeners : {
						afteranimate : function() {
							field.setWidth(field.blurWidth);
							//field.ownerCt.doLayout();
						}
					}
				})
		}
	},


	triggers: {
        clear: {
            weight: 0,
            cls: Ext.baseCSSPrefix + 'form-clear-trigger',
            hidden: true,
            handler: 'onClearClick',
            scope: 'this'
        },
        search: {
            weight: 1,
            cls: Ext.baseCSSPrefix + 'form-search-trigger',
            handler: 'onSearchClick',
            scope: 'this'
        }
    },

    hasSearch : false,

    initComponent: function() {
        var me = this
        me.callParent(arguments);
        me.on('specialkey', function(f, e){
            if (e.getKey() == e.ENTER) {
                me.onSearchClick();
            }
        });
    },

    onClearClick : function(){
        var me = this
        me.setValue('');
        me.getTrigger('clear').hide();
        me.updateLayout();
    },

    onSearchClick : function(){
        var me = this,
            value = me.getValue();
        if (value.length > 0) {
            me.store.loadPage(1,{params:{'tf_code':value}})
            me.getTrigger('clear').show();
            me.updateLayout();
        }else{
            me.store.loadPage(1)
            me.getTrigger('clear').hide();
            me.updateLayout();
        }
    }
})