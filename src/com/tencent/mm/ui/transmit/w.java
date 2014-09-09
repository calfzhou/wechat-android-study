package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.p;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.e;

public final class w
{
  private aa fav;
  private z jYB;

  private w(z paramz)
  {
    this.jYB = paramz;
  }

  public static final w a(Context paramContext, WXMediaMessage paramWXMediaMessage, com.tencent.mm.pluginsdk.model.app.k paramk, z paramz)
  {
    w localw = new w(paramz);
    if (paramWXMediaMessage.thumbData == null);
    for (Bitmap localBitmap = null; ; localBitmap = com.tencent.mm.sdk.platformtools.i.cB(paramWXMediaMessage.thumbData))
      switch (paramWXMediaMessage.mediaObject.type())
      {
      default:
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLiQ1shHpyNJ74umTr3oI2U", "unkown app message type, skipped, type=" + paramWXMediaMessage.mediaObject.type());
        return null;
      case 1:
      case 2:
      case 3:
      case 4:
      case 6:
      case 5:
      case 7:
      }
    Object localObject = View.inflate(paramContext, com.tencent.mm.k.baZ, null);
    ((TextView)((View)localObject).findViewById(com.tencent.mm.i.aTl)).setText(paramWXMediaMessage.title);
    while (true)
    {
      ((TextView)((View)localObject).findViewById(com.tencent.mm.i.aRH)).setText(l.d(paramContext, paramk));
      localw.fav = e.a(paramContext, null, (View)localObject, paramContext.getString(n.buh), paramContext.getString(n.bsK), new x(localw), new y(localw));
      return localw;
      View localView6 = View.inflate(paramContext, com.tencent.mm.k.baY, null);
      ((ImageView)localView6.findViewById(com.tencent.mm.i.aSN)).setImageBitmap(localBitmap);
      ((TextView)localView6.findViewById(com.tencent.mm.i.aTl)).setText(paramWXMediaMessage.title);
      localObject = localView6;
      continue;
      View localView5 = View.inflate(paramContext, com.tencent.mm.k.baX, null);
      ((ImageView)localView5.findViewById(com.tencent.mm.i.aSN)).setImageBitmap(localBitmap);
      TextView localTextView9 = (TextView)localView5.findViewById(com.tencent.mm.i.aTl);
      TextView localTextView10 = (TextView)localView5.findViewById(com.tencent.mm.i.apF);
      localTextView9.setText(paramWXMediaMessage.title);
      localTextView10.setText(paramWXMediaMessage.description);
      localObject = localView5;
      continue;
      View localView4 = View.inflate(paramContext, com.tencent.mm.k.baX, null);
      ((ImageView)localView4.findViewById(com.tencent.mm.i.aSN)).setImageBitmap(localBitmap);
      TextView localTextView7 = (TextView)localView4.findViewById(com.tencent.mm.i.aTl);
      TextView localTextView8 = (TextView)localView4.findViewById(com.tencent.mm.i.apF);
      localTextView7.setText(paramWXMediaMessage.title);
      localTextView8.setText(paramWXMediaMessage.description);
      localObject = localView4;
      continue;
      View localView3 = View.inflate(paramContext, com.tencent.mm.k.baX, null);
      ((ImageView)localView3.findViewById(com.tencent.mm.i.aSN)).setImageBitmap(localBitmap);
      TextView localTextView5 = (TextView)localView3.findViewById(com.tencent.mm.i.aTl);
      TextView localTextView6 = (TextView)localView3.findViewById(com.tencent.mm.i.apF);
      localTextView5.setText(paramWXMediaMessage.title);
      localTextView6.setText(paramWXMediaMessage.description);
      localObject = localView3;
      continue;
      View localView2 = View.inflate(paramContext, com.tencent.mm.k.baX, null);
      ((ImageView)localView2.findViewById(com.tencent.mm.i.aSN)).setImageBitmap(localBitmap);
      TextView localTextView3 = (TextView)localView2.findViewById(com.tencent.mm.i.aTl);
      TextView localTextView4 = (TextView)localView2.findViewById(com.tencent.mm.i.apF);
      localTextView3.setText(paramWXMediaMessage.title);
      localTextView4.setText(paramWXMediaMessage.description);
      localObject = localView2;
      continue;
      View localView1 = View.inflate(paramContext, com.tencent.mm.k.baX, null);
      ((ImageView)localView1.findViewById(com.tencent.mm.i.aSN)).setImageBitmap(localBitmap);
      TextView localTextView1 = (TextView)localView1.findViewById(com.tencent.mm.i.aTl);
      TextView localTextView2 = (TextView)localView1.findViewById(com.tencent.mm.i.apF);
      localTextView1.setText(paramWXMediaMessage.title);
      localTextView2.setText(paramWXMediaMessage.description);
      localObject = localView1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.w
 * JD-Core Version:    0.6.2
 */