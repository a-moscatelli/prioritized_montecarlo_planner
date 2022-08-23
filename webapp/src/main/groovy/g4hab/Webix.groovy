package g4hab

/*
	http://amplifyjs.com/api/pubsub/

	amplify.subscribe( "nodataexample", function() {
		alert( "nodataexample topic published!" );
	});
	amplify.publish( "nodataexample" );

	amplify.subscribe( "dataexample", function( data ) {
		alert( data.foo ); // bar
	});

	amplify.publish( "dataexample", { foo: "bar" } );
	
*/



class Webix {

public final String the_webix="webix.js" // "webix.min.js"
// http://amplifyjs.com/api/pubsub/

public final String html_head_webix = """
<meta charset="UTF-8">

<script src="https://cdnjs.cloudflare.com/ajax/libs/amplifyjs/1.1.2/amplify.core.min.js" type="text/javascript"></script>

<!--
https://cdn.jsdelivr.net/npm/radiojs@1.0.1/src/radio.min.js
https://cdnjs.cloudflare.com/ajax/libs/radio/0.2.0/radio.min.js
-->

<link rel="stylesheet" href="https://cdn.webix.com/edge/webix.css" type="text/css">
<script src="https://cdn.webix.com/edge/${the_webix}" type="text/javascript"></script> 

<!-- skin
<link rel="stylesheet" href="https://cdn.webix.com/site/skins/flat.css" type="text/css"   charset="utf-8">
 -->

<!--The following uses data URI and can be used to avoid fake favicon requests:-->
<!-- https://stackoverflow.com/questions/1321878/how-to-prevent-favicon-ico-requests -->

<link rel="shortcut icon" href="data:image/x-icon;," type="image/x-icon"> 
"""



public final String html_head_style = """
<!-- safe colors -->
.r_highlight {
	background-color:#CC6666;
}
.g_highlight {
	background-color:#99CC99;
}
.g_editable_sleep {
	background-color:#FFFFCC;
}
.g_editable_sleep_ALT1 {
	background-color:#FFFFCC;
	border-width: 1px;
	border-style: solid;
	border-color: grey;
}
.k_border {
	border:1px solid black;
}
.a_center {
	text-align:center;
}
.a_right{
	text-align:right;
}
"""
// 	<%-- g_editable_sleep : also: light green: #CCFFCC; --%>


	Webix() {}

}