package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.widget.BaseAdapter;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class c extends BaseAdapter
{
  List hCn;
  private int hCo;
  private int hCp;

  public c(AppGrid paramAppGrid, Context paramContext, List paramList)
  {
    this.hCn = paramList;
    this.hCo = e.a(paramContext, 64.0F);
    this.hCp = e.a(paramContext, 53.299999F);
  }

  public final int getCount()
  {
    if (AppGrid.a(this.hCm) == -1 + AppGrid.e(this.hCm))
      return AppGrid.f(this.hCm) - AppGrid.a(this.hCm) * AppGrid.b(this.hCm);
    return AppGrid.b(this.hCm);
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  // ERROR //
  public final android.view.View getView(int paramInt, android.view.View paramView, android.view.ViewGroup paramViewGroup)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +358 -> 359
    //   4: new 62	com/tencent/mm/pluginsdk/ui/chat/d
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 65	com/tencent/mm/pluginsdk/ui/chat/d:<init>	(Lcom/tencent/mm/pluginsdk/ui/chat/c;)V
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   18: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   21: getstatic 74	com/tencent/mm/k:baS	I
    //   24: aconst_null
    //   25: invokestatic 80	android/view/View:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   28: astore_2
    //   29: aload 4
    //   31: aload_2
    //   32: getstatic 85	com/tencent/mm/i:afW	I
    //   35: invokevirtual 89	android/view/View:findViewById	(I)Landroid/view/View;
    //   38: checkcast 91	android/widget/ImageView
    //   41: putfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   44: aload 4
    //   46: aload_2
    //   47: getstatic 98	com/tencent/mm/i:afX	I
    //   50: invokevirtual 89	android/view/View:findViewById	(I)Landroid/view/View;
    //   53: putfield 102	com/tencent/mm/pluginsdk/ui/chat/d:hzI	Landroid/view/View;
    //   56: aload 4
    //   58: aload_2
    //   59: getstatic 105	com/tencent/mm/i:afY	I
    //   62: invokevirtual 89	android/view/View:findViewById	(I)Landroid/view/View;
    //   65: checkcast 107	android/widget/TextView
    //   68: putfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   71: aload 4
    //   73: aload_2
    //   74: getstatic 114	com/tencent/mm/i:afZ	I
    //   77: invokevirtual 89	android/view/View:findViewById	(I)Landroid/view/View;
    //   80: checkcast 107	android/widget/TextView
    //   83: putfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   86: aload 4
    //   88: aload_2
    //   89: getstatic 120	com/tencent/mm/i:aga	I
    //   92: invokevirtual 89	android/view/View:findViewById	(I)Landroid/view/View;
    //   95: putfield 123	com/tencent/mm/pluginsdk/ui/chat/d:hCr	Landroid/view/View;
    //   98: aload_2
    //   99: aload 4
    //   101: invokevirtual 127	android/view/View:setTag	(Ljava/lang/Object;)V
    //   104: ldc 129
    //   106: new 131	java/lang/StringBuilder
    //   109: dup
    //   110: ldc 133
    //   112: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: iload_1
    //   116: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   119: ldc 142
    //   121: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_0
    //   125: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   128: invokestatic 39	com/tencent/mm/pluginsdk/ui/chat/AppGrid:a	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)I
    //   131: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   134: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokestatic 155	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: aload 4
    //   142: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   145: iconst_0
    //   146: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   149: aload 4
    //   151: getfield 123	com/tencent/mm/pluginsdk/ui/chat/d:hCr	Landroid/view/View;
    //   154: bipush 8
    //   156: invokevirtual 160	android/view/View:setVisibility	(I)V
    //   159: aload 4
    //   161: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   164: bipush 8
    //   166: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   169: aload 4
    //   171: getfield 102	com/tencent/mm/pluginsdk/ui/chat/d:hzI	Landroid/view/View;
    //   174: iconst_0
    //   175: invokevirtual 160	android/view/View:setVisibility	(I)V
    //   178: aload 4
    //   180: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   183: invokevirtual 164	android/widget/ImageView:getLayoutParams	()Landroid/view/ViewGroup$LayoutParams;
    //   186: astore 5
    //   188: aload 5
    //   190: aload_0
    //   191: getfield 29	com/tencent/mm/pluginsdk/ui/chat/c:hCo	I
    //   194: putfield 169	android/view/ViewGroup$LayoutParams:width	I
    //   197: aload 5
    //   199: aload_0
    //   200: getfield 29	com/tencent/mm/pluginsdk/ui/chat/c:hCo	I
    //   203: putfield 172	android/view/ViewGroup$LayoutParams:height	I
    //   206: aload 4
    //   208: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   211: aload 5
    //   213: invokevirtual 176	android/widget/ImageView:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   216: iload_1
    //   217: aload_0
    //   218: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   221: invokestatic 39	com/tencent/mm/pluginsdk/ui/chat/AppGrid:a	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)I
    //   224: aload_0
    //   225: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   228: invokestatic 48	com/tencent/mm/pluginsdk/ui/chat/AppGrid:b	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)I
    //   231: imul
    //   232: iadd
    //   233: aload_0
    //   234: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   237: invokestatic 179	com/tencent/mm/pluginsdk/ui/chat/AppGrid:g	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)I
    //   240: if_icmpge +759 -> 999
    //   243: aload_0
    //   244: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   247: invokestatic 183	com/tencent/mm/pluginsdk/ui/chat/AppGrid:c	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Lcom/tencent/mm/pluginsdk/ui/chat/e;
    //   250: iload_1
    //   251: aload_0
    //   252: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   255: invokestatic 39	com/tencent/mm/pluginsdk/ui/chat/AppGrid:a	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)I
    //   258: aload_0
    //   259: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   262: invokestatic 48	com/tencent/mm/pluginsdk/ui/chat/AppGrid:b	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)I
    //   265: imul
    //   266: iadd
    //   267: invokeinterface 189 2 0
    //   272: tableswitch	default:+56 -> 328, 0:+331->603, 1:+296->568, 2:+366->638, 3:+530->802, 4:+448->720, 5:+99->371, 6:+646->918, 7:+565->837, 8:+215->487, 9:+134->406
    //   329: iload_1
    //   330: invokevirtual 54	com/tencent/mm/pluginsdk/ui/chat/c:mJ	(I)Lcom/tencent/mm/pluginsdk/model/app/k;
    //   333: astore 8
    //   335: aload 8
    //   337: ifnull +20 -> 357
    //   340: aload 8
    //   342: invokestatic 195	com/tencent/mm/pluginsdk/model/app/l:l	(Lcom/tencent/mm/pluginsdk/model/app/k;)Z
    //   345: ifeq +12 -> 357
    //   348: aload 4
    //   350: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   353: iconst_0
    //   354: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   357: aload_2
    //   358: areturn
    //   359: aload_2
    //   360: invokevirtual 199	android/view/View:getTag	()Ljava/lang/Object;
    //   363: checkcast 62	com/tencent/mm/pluginsdk/ui/chat/d
    //   366: astore 4
    //   368: goto -264 -> 104
    //   371: aload 4
    //   373: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   376: getstatic 204	com/tencent/mm/h:RN	I
    //   379: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   382: aload 4
    //   384: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   387: aload_0
    //   388: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   391: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   394: getstatic 212	com/tencent/mm/n:btn	I
    //   397: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   400: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   403: goto -75 -> 328
    //   406: aload 4
    //   408: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   411: getstatic 225	com/tencent/mm/h:RX	I
    //   414: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   417: aload 4
    //   419: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   422: aload_0
    //   423: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   426: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   429: getstatic 228	com/tencent/mm/n:btt	I
    //   432: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   435: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   438: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   441: invokevirtual 240	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   444: bipush 67
    //   446: iconst_0
    //   447: invokestatic 246	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   450: invokevirtual 252	com/tencent/mm/storage/e:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   453: checkcast 242	java/lang/Boolean
    //   456: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   459: ifeq +15 -> 474
    //   462: aload 4
    //   464: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   467: iconst_0
    //   468: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   471: goto -143 -> 328
    //   474: aload 4
    //   476: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   479: bipush 8
    //   481: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   484: goto -156 -> 328
    //   487: aload 4
    //   489: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   492: getstatic 259	com/tencent/mm/h:RW	I
    //   495: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   498: aload 4
    //   500: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   503: aload_0
    //   504: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   507: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   510: getstatic 262	com/tencent/mm/n:bOE	I
    //   513: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   516: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   519: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   522: invokevirtual 240	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   525: bipush 73
    //   527: iconst_0
    //   528: invokestatic 246	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   531: invokevirtual 252	com/tencent/mm/storage/e:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   534: checkcast 242	java/lang/Boolean
    //   537: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   540: ifeq +15 -> 555
    //   543: aload 4
    //   545: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   548: iconst_0
    //   549: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   552: goto -224 -> 328
    //   555: aload 4
    //   557: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   560: bipush 8
    //   562: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   565: goto -237 -> 328
    //   568: aload 4
    //   570: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   573: getstatic 265	com/tencent/mm/h:RT	I
    //   576: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   579: aload 4
    //   581: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   584: aload_0
    //   585: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   588: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   591: getstatic 268	com/tencent/mm/n:btv	I
    //   594: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   597: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   600: goto -272 -> 328
    //   603: aload 4
    //   605: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   608: getstatic 271	com/tencent/mm/h:RQ	I
    //   611: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   614: aload 4
    //   616: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   619: aload_0
    //   620: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   623: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   626: getstatic 274	com/tencent/mm/n:btq	I
    //   629: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   632: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   635: goto -307 -> 328
    //   638: aload 4
    //   640: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   643: getstatic 277	com/tencent/mm/h:RP	I
    //   646: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   649: aload 4
    //   651: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   654: aload_0
    //   655: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   658: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   661: getstatic 280	com/tencent/mm/n:bto	I
    //   664: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   667: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   670: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   673: invokevirtual 240	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   676: ldc_w 281
    //   679: iconst_0
    //   680: invokestatic 246	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   683: invokevirtual 252	com/tencent/mm/storage/e:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   686: checkcast 242	java/lang/Boolean
    //   689: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   692: ifeq +15 -> 707
    //   695: aload 4
    //   697: getfield 123	com/tencent/mm/pluginsdk/ui/chat/d:hCr	Landroid/view/View;
    //   700: iconst_0
    //   701: invokevirtual 160	android/view/View:setVisibility	(I)V
    //   704: goto -376 -> 328
    //   707: aload 4
    //   709: getfield 123	com/tencent/mm/pluginsdk/ui/chat/d:hCr	Landroid/view/View;
    //   712: bipush 8
    //   714: invokevirtual 160	android/view/View:setVisibility	(I)V
    //   717: goto -389 -> 328
    //   720: aload 4
    //   722: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   725: getstatic 284	com/tencent/mm/h:RR	I
    //   728: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   731: aload 4
    //   733: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   736: aload_0
    //   737: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   740: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   743: getstatic 287	com/tencent/mm/n:bts	I
    //   746: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   749: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   752: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   755: invokevirtual 240	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   758: ldc_w 288
    //   761: iconst_1
    //   762: invokestatic 246	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   765: invokevirtual 252	com/tencent/mm/storage/e:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   768: checkcast 242	java/lang/Boolean
    //   771: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   774: ifeq +15 -> 789
    //   777: aload 4
    //   779: getfield 123	com/tencent/mm/pluginsdk/ui/chat/d:hCr	Landroid/view/View;
    //   782: iconst_0
    //   783: invokevirtual 160	android/view/View:setVisibility	(I)V
    //   786: goto -458 -> 328
    //   789: aload 4
    //   791: getfield 123	com/tencent/mm/pluginsdk/ui/chat/d:hCr	Landroid/view/View;
    //   794: bipush 8
    //   796: invokevirtual 160	android/view/View:setVisibility	(I)V
    //   799: goto -471 -> 328
    //   802: aload 4
    //   804: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   807: getstatic 291	com/tencent/mm/h:RO	I
    //   810: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   813: aload 4
    //   815: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   818: aload_0
    //   819: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   822: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   825: getstatic 294	com/tencent/mm/n:btl	I
    //   828: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   831: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   834: goto -506 -> 328
    //   837: aload 4
    //   839: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   842: getstatic 297	com/tencent/mm/h:RU	I
    //   845: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   848: aload 4
    //   850: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   853: aload_0
    //   854: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   857: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   860: getstatic 300	com/tencent/mm/n:btw	I
    //   863: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   866: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   869: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   872: invokevirtual 240	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   875: bipush 54
    //   877: iconst_0
    //   878: invokestatic 246	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   881: invokevirtual 252	com/tencent/mm/storage/e:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   884: checkcast 242	java/lang/Boolean
    //   887: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   890: ifeq +15 -> 905
    //   893: aload 4
    //   895: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   898: iconst_0
    //   899: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   902: goto -574 -> 328
    //   905: aload 4
    //   907: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   910: bipush 8
    //   912: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   915: goto -587 -> 328
    //   918: aload 4
    //   920: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   923: getstatic 303	com/tencent/mm/h:RV	I
    //   926: invokevirtual 207	android/widget/ImageView:setImageResource	(I)V
    //   929: aload 4
    //   931: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   934: aload_0
    //   935: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   938: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   941: getstatic 306	com/tencent/mm/n:btx	I
    //   944: invokevirtual 218	android/content/Context:getString	(I)Ljava/lang/String;
    //   947: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   950: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   953: invokevirtual 240	com/tencent/mm/model/b:oQ	()Lcom/tencent/mm/storage/e;
    //   956: bipush 62
    //   958: iconst_0
    //   959: invokestatic 246	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   962: invokevirtual 252	com/tencent/mm/storage/e:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   965: checkcast 242	java/lang/Boolean
    //   968: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   971: ifeq +15 -> 986
    //   974: aload 4
    //   976: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   979: iconst_0
    //   980: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   983: goto -655 -> 328
    //   986: aload 4
    //   988: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   991: bipush 8
    //   993: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   996: goto -668 -> 328
    //   999: aload 5
    //   1001: aload_0
    //   1002: getfield 32	com/tencent/mm/pluginsdk/ui/chat/c:hCp	I
    //   1005: putfield 169	android/view/ViewGroup$LayoutParams:width	I
    //   1008: aload 5
    //   1010: aload_0
    //   1011: getfield 32	com/tencent/mm/pluginsdk/ui/chat/c:hCp	I
    //   1014: putfield 172	android/view/ViewGroup$LayoutParams:height	I
    //   1017: aload 4
    //   1019: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   1022: aload 5
    //   1024: invokevirtual 176	android/widget/ImageView:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   1027: aload_0
    //   1028: iload_1
    //   1029: invokevirtual 54	com/tencent/mm/pluginsdk/ui/chat/c:mJ	(I)Lcom/tencent/mm/pluginsdk/model/app/k;
    //   1032: astore 6
    //   1034: aload 6
    //   1036: ifnull -708 -> 328
    //   1039: invokestatic 234	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   1042: invokevirtual 309	com/tencent/mm/model/b:isSDCardAvailable	()Z
    //   1045: ifeq +301 -> 1346
    //   1048: aload 6
    //   1050: getfield 314	com/tencent/mm/pluginsdk/model/app/k:field_status	I
    //   1053: iconst_5
    //   1054: if_icmpne +312 -> 1366
    //   1057: invokestatic 320	com/tencent/mm/q/aa:vb	()Lcom/tencent/mm/compatible/loader/b;
    //   1060: aload 6
    //   1062: getfield 324	com/tencent/mm/pluginsdk/model/app/k:field_packageName	Ljava/lang/String;
    //   1065: ldc_w 326
    //   1068: ldc_w 328
    //   1071: invokevirtual 334	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1074: invokevirtual 340	com/tencent/mm/compatible/loader/b:getDrawable	(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   1077: astore 10
    //   1079: aload 10
    //   1081: ifnull +140 -> 1221
    //   1084: aload 4
    //   1086: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   1089: aload 10
    //   1091: invokevirtual 344	android/widget/ImageView:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   1094: aload 4
    //   1096: getfield 111	com/tencent/mm/pluginsdk/ui/chat/d:fPQ	Landroid/widget/TextView;
    //   1099: aload_0
    //   1100: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1103: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   1106: aload 6
    //   1108: invokestatic 348	com/tencent/mm/pluginsdk/model/app/l:d	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/k;)Ljava/lang/String;
    //   1111: invokevirtual 222	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1114: aload 6
    //   1116: invokevirtual 351	com/tencent/mm/pluginsdk/model/app/k:ayE	()Z
    //   1119: ifeq -791 -> 328
    //   1122: iconst_2
    //   1123: aload 6
    //   1125: getfield 354	com/tencent/mm/pluginsdk/model/app/k:field_serviceAppInfoFlag	I
    //   1128: iand
    //   1129: ifeq +231 -> 1360
    //   1132: iconst_1
    //   1133: istore 7
    //   1135: iload 7
    //   1137: ifeq -809 -> 328
    //   1140: aload_0
    //   1141: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1144: invokestatic 358	com/tencent/mm/pluginsdk/ui/chat/AppGrid:i	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/SharedPreferences;
    //   1147: ifnonnull +25 -> 1172
    //   1150: aload_0
    //   1151: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1154: aload_0
    //   1155: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1158: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   1161: invokestatic 363	com/tencent/mm/sdk/platformtools/ak:aHi	()Ljava/lang/String;
    //   1164: iconst_0
    //   1165: invokevirtual 367	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1168: invokestatic 370	com/tencent/mm/pluginsdk/ui/chat/AppGrid:a	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences;
    //   1171: pop
    //   1172: aload_0
    //   1173: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1176: invokestatic 358	com/tencent/mm/pluginsdk/ui/chat/AppGrid:i	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/SharedPreferences;
    //   1179: new 131	java/lang/StringBuilder
    //   1182: dup
    //   1183: ldc_w 372
    //   1186: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1189: aload 6
    //   1191: getfield 375	com/tencent/mm/pluginsdk/model/app/k:field_appId	Ljava/lang/String;
    //   1194: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1197: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1200: iconst_1
    //   1201: invokeinterface 381 3 0
    //   1206: ifeq -878 -> 328
    //   1209: aload 4
    //   1211: getfield 117	com/tencent/mm/pluginsdk/ui/chat/d:hCq	Landroid/widget/TextView;
    //   1214: iconst_0
    //   1215: invokevirtual 159	android/widget/TextView:setVisibility	(I)V
    //   1218: goto -890 -> 328
    //   1221: aload 6
    //   1223: getfield 314	com/tencent/mm/pluginsdk/model/app/k:field_status	I
    //   1226: iconst_5
    //   1227: if_icmpne +49 -> 1276
    //   1230: aload 6
    //   1232: getfield 375	com/tencent/mm/pluginsdk/model/app/k:field_appId	Ljava/lang/String;
    //   1235: iconst_3
    //   1236: aload_0
    //   1237: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1240: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   1243: invokestatic 387	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   1246: invokestatic 390	com/tencent/mm/pluginsdk/model/app/l:b	(Ljava/lang/String;IF)Landroid/graphics/Bitmap;
    //   1249: astore 11
    //   1251: aload 11
    //   1253: ifnull +79 -> 1332
    //   1256: aload 4
    //   1258: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   1261: new 392	android/graphics/drawable/BitmapDrawable
    //   1264: dup
    //   1265: aload 11
    //   1267: invokespecial 395	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
    //   1270: invokevirtual 344	android/widget/ImageView:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   1273: goto -179 -> 1094
    //   1276: aload 6
    //   1278: invokevirtual 351	com/tencent/mm/pluginsdk/model/app/k:ayE	()Z
    //   1281: ifeq +27 -> 1308
    //   1284: aload 6
    //   1286: getfield 375	com/tencent/mm/pluginsdk/model/app/k:field_appId	Ljava/lang/String;
    //   1289: iconst_4
    //   1290: aload_0
    //   1291: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1294: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   1297: invokestatic 387	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   1300: invokestatic 390	com/tencent/mm/pluginsdk/model/app/l:b	(Ljava/lang/String;IF)Landroid/graphics/Bitmap;
    //   1303: astore 11
    //   1305: goto -54 -> 1251
    //   1308: aload 6
    //   1310: getfield 375	com/tencent/mm/pluginsdk/model/app/k:field_appId	Ljava/lang/String;
    //   1313: iconst_1
    //   1314: aload_0
    //   1315: getfield 15	com/tencent/mm/pluginsdk/ui/chat/c:hCm	Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;
    //   1318: invokestatic 69	com/tencent/mm/pluginsdk/ui/chat/AppGrid:h	(Lcom/tencent/mm/pluginsdk/ui/chat/AppGrid;)Landroid/content/Context;
    //   1321: invokestatic 387	com/tencent/mm/aq/a:getDensity	(Landroid/content/Context;)F
    //   1324: invokestatic 390	com/tencent/mm/pluginsdk/model/app/l:b	(Ljava/lang/String;IF)Landroid/graphics/Bitmap;
    //   1327: astore 11
    //   1329: goto -78 -> 1251
    //   1332: aload 4
    //   1334: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   1337: getstatic 398	com/tencent/mm/h:RS	I
    //   1340: invokevirtual 401	android/widget/ImageView:setBackgroundResource	(I)V
    //   1343: goto -249 -> 1094
    //   1346: aload 4
    //   1348: getfield 95	com/tencent/mm/pluginsdk/ui/chat/d:fpi	Landroid/widget/ImageView;
    //   1351: getstatic 404	com/tencent/mm/h:aaG	I
    //   1354: invokevirtual 401	android/widget/ImageView:setBackgroundResource	(I)V
    //   1357: goto -263 -> 1094
    //   1360: iconst_0
    //   1361: istore 7
    //   1363: goto -228 -> 1135
    //   1366: aconst_null
    //   1367: astore 10
    //   1369: goto -290 -> 1079
    //   1372: astore 17
    //   1374: goto -1046 -> 328
    //   1377: astore 16
    //   1379: goto -1051 -> 328
    //   1382: astore 15
    //   1384: goto -1056 -> 328
    //   1387: astore 14
    //   1389: goto -1061 -> 328
    //   1392: astore 13
    //   1394: goto -1066 -> 328
    //   1397: astore 12
    //   1399: goto -1071 -> 328
    //
    // Exception table:
    //   from	to	target	type
    //   438	471	1372	java/lang/Exception
    //   474	484	1372	java/lang/Exception
    //   519	552	1377	java/lang/Exception
    //   555	565	1377	java/lang/Exception
    //   670	704	1382	java/lang/Exception
    //   707	717	1382	java/lang/Exception
    //   752	786	1387	java/lang/Exception
    //   789	799	1387	java/lang/Exception
    //   869	902	1392	java/lang/Exception
    //   905	915	1392	java/lang/Exception
    //   950	983	1397	java/lang/Exception
    //   986	996	1397	java/lang/Exception
  }

  public final k mJ(int paramInt)
  {
    if (((paramInt < AppGrid.g(this.hCm)) && (AppGrid.a(this.hCm) == 0)) || (paramInt + AppGrid.a(this.hCm) * AppGrid.b(this.hCm) < AppGrid.g(this.hCm)) || (paramInt - AppGrid.g(this.hCm) + AppGrid.a(this.hCm) * AppGrid.b(this.hCm) >= this.hCn.size()))
      return null;
    z.v("!32@/B4Tb64lLpKWQsMgLfVFVLoALSSMxsuZ", "get item db pos:" + (paramInt - AppGrid.g(this.hCm) + AppGrid.a(this.hCm) * AppGrid.b(this.hCm)));
    return (k)this.hCn.get(paramInt - AppGrid.g(this.hCm) + AppGrid.a(this.hCm) * AppGrid.b(this.hCm));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.c
 * JD-Core Version:    0.6.2
 */