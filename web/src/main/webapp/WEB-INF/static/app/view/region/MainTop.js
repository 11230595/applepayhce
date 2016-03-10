/**
 * Created by PETER on 2015/6/4.
 */
Ext.define('app.view.region.MainTop',{
	extend:'Ext.container.Container',
	alias:'widget.mainTop',
	height:40,
	layout:{
		type:'hbox',
		align:'middle'
	},
	style:'background-color : #cde6c7',

	items:[
		{
			xtype:'image',
			bind:{
				hidden:'{!system.iconUrl}',
				src:'{system.iconUrl}'
			},
			margin:'0 0 0 20',
			height:32

		},
		{
			xtype:'label',
			bind:{
				text:'{system.name}'
			},
			style:'font-size:20px;color:blue;',
			margin:'0 5 0 20'
		},
		{
			xtype : 'label',
			style : 'color:grey;',
			bind : {
				text : '({system.version})'
			},
			margin:'0 5 0 20'
		},
		{
			xtype: 'tbspacer',
			flex:3
		}
	]

});