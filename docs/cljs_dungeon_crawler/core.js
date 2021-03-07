// Compiled by ClojureScript 1.10.758 {:static-fns true, :optimize-constants true, :target :nodejs}
goog.provide('cljs_dungeon_crawler.core');
goog.require('cljs.core');
goog.require('cljs.core.constants');
goog.require('cljs_dungeon_crawler.sprites');
cljs_dungeon_crawler.core.node$module$pixi$js = require('pixi.js');
cljs_dungeon_crawler.core.app = (new cljs_dungeon_crawler.core.node$module$pixi$js.Application(({"width": (256), "height": (256), "antialias": true, "transparent": false, "resolution": (1)})));
document.body.appendChild(cljs_dungeon_crawler.core.app.view);
cljs_dungeon_crawler.core.tile_size = (16);
cljs_dungeon_crawler.core.dungeon = (function (){var iter__4529__auto__ = (function cljs_dungeon_crawler$core$iter__545(s__546){
return (new cljs.core.LazySeq(null,(function (){
var s__546__$1 = s__546;
while(true){
var temp__5735__auto__ = cljs.core.seq(s__546__$1);
if(temp__5735__auto__){
var xs__6292__auto__ = temp__5735__auto__;
var y = cljs.core.first(xs__6292__auto__);
var iterys__4525__auto__ = ((function (s__546__$1,y,xs__6292__auto__,temp__5735__auto__){
return (function cljs_dungeon_crawler$core$iter__545_$_iter__547(s__548){
return (new cljs.core.LazySeq(null,((function (s__546__$1,y,xs__6292__auto__,temp__5735__auto__){
return (function (){
var s__548__$1 = s__548;
while(true){
var temp__5735__auto____$1 = cljs.core.seq(s__548__$1);
if(temp__5735__auto____$1){
var s__548__$2 = temp__5735__auto____$1;
if(cljs.core.chunked_seq_QMARK_(s__548__$2)){
var c__4527__auto__ = cljs.core.chunk_first(s__548__$2);
var size__4528__auto__ = cljs.core.count(c__4527__auto__);
var b__550 = cljs.core.chunk_buffer(size__4528__auto__);
if((function (){var i__549 = (0);
while(true){
if((i__549 < size__4528__auto__)){
var x = cljs.core._nth.cljs$core$IFn$_invoke$arity$2(c__4527__auto__,i__549);
cljs.core.chunk_append(b__550,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$x,x,cljs.core.cst$kw$y,y,cljs.core.cst$kw$tile,(cljs.core.truth_((function (){var or__4126__auto__ = (function (){var fexpr__552 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [(0),null,(15),null], null), null);
return (fexpr__552.cljs$core$IFn$_invoke$arity$1 ? fexpr__552.cljs$core$IFn$_invoke$arity$1(x) : fexpr__552.call(null,x));
})();
if(cljs.core.truth_(or__4126__auto__)){
return or__4126__auto__;
} else {
var fexpr__553 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [(0),null,(15),null], null), null);
return (fexpr__553.cljs$core$IFn$_invoke$arity$1 ? fexpr__553.cljs$core$IFn$_invoke$arity$1(y) : fexpr__553.call(null,y));
}
})())?cljs.core.cst$kw$w:cljs.core.cst$kw$f)], null));

var G__557 = (i__549 + (1));
i__549 = G__557;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__550),cljs_dungeon_crawler$core$iter__545_$_iter__547(cljs.core.chunk_rest(s__548__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__550),null);
}
} else {
var x = cljs.core.first(s__548__$2);
return cljs.core.cons(new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$x,x,cljs.core.cst$kw$y,y,cljs.core.cst$kw$tile,(cljs.core.truth_((function (){var or__4126__auto__ = (function (){var fexpr__555 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [(0),null,(15),null], null), null);
return (fexpr__555.cljs$core$IFn$_invoke$arity$1 ? fexpr__555.cljs$core$IFn$_invoke$arity$1(x) : fexpr__555.call(null,x));
})();
if(cljs.core.truth_(or__4126__auto__)){
return or__4126__auto__;
} else {
var fexpr__556 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [(0),null,(15),null], null), null);
return (fexpr__556.cljs$core$IFn$_invoke$arity$1 ? fexpr__556.cljs$core$IFn$_invoke$arity$1(y) : fexpr__556.call(null,y));
}
})())?cljs.core.cst$kw$w:cljs.core.cst$kw$f)], null),cljs_dungeon_crawler$core$iter__545_$_iter__547(cljs.core.rest(s__548__$2)));
}
} else {
return null;
}
break;
}
});})(s__546__$1,y,xs__6292__auto__,temp__5735__auto__))
,null,null));
});})(s__546__$1,y,xs__6292__auto__,temp__5735__auto__))
;
var fs__4526__auto__ = cljs.core.seq(iterys__4525__auto__(cljs.core.range.cljs$core$IFn$_invoke$arity$2((0),(16))));
if(fs__4526__auto__){
return cljs.core.concat.cljs$core$IFn$_invoke$arity$2(fs__4526__auto__,cljs_dungeon_crawler$core$iter__545(cljs.core.rest(s__546__$1)));
} else {
var G__558 = cljs.core.rest(s__546__$1);
s__546__$1 = G__558;
continue;
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__4529__auto__(cljs.core.range.cljs$core$IFn$_invoke$arity$2((0),(16)));
})();
cljs_dungeon_crawler.core.clear_stage = (function cljs_dungeon_crawler$core$clear_stage(){
return cljs_dungeon_crawler.core.app.stage.removeChildren();
});
cljs_dungeon_crawler.core.add_tile = (function cljs_dungeon_crawler$core$add_tile(tile__GT_texture,p__559){
var map__560 = p__559;
var map__560__$1 = (((((!((map__560 == null))))?(((((map__560.cljs$lang$protocol_mask$partition0$ & (64))) || ((cljs.core.PROTOCOL_SENTINEL === map__560.cljs$core$ISeq$))))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__560):map__560);
var tile = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__560__$1,cljs.core.cst$kw$tile);
var x = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__560__$1,cljs.core.cst$kw$x);
var y = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__560__$1,cljs.core.cst$kw$y);
var block = (new cljs_dungeon_crawler.core.node$module$pixi$js.Sprite((tile__GT_texture.cljs$core$IFn$_invoke$arity$1 ? tile__GT_texture.cljs$core$IFn$_invoke$arity$1(tile) : tile__GT_texture.call(null,tile))));
(block.x = (cljs_dungeon_crawler.core.tile_size * x));

(block.y = (cljs_dungeon_crawler.core.tile_size * y));

return cljs_dungeon_crawler.core.app.stage.addChild(block);
});
cljs_dungeon_crawler.core.setup = (function cljs_dungeon_crawler$core$setup(){
var tile__GT_texture = new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$w,(cljs_dungeon_crawler.sprites.get_sheet(cljs_dungeon_crawler.core.app).textures["wall_mid"]),cljs.core.cst$kw$f,(cljs_dungeon_crawler.sprites.get_sheet(cljs_dungeon_crawler.core.app).textures["floor_1"])], null);
cljs_dungeon_crawler.core.clear_stage();

return cljs.core.mapv.cljs$core$IFn$_invoke$arity$2(cljs.core.partial.cljs$core$IFn$_invoke$arity$2(cljs_dungeon_crawler.core.add_tile,tile__GT_texture),cljs_dungeon_crawler.core.dungeon);
});
cljs_dungeon_crawler.core.app.loader.add("resources/spritesheet.json").load(cljs_dungeon_crawler.core.setup);
