package com.tencent.mm.ui.chatting;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import com.tencent.mm.a.c;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.pluginsdk.ui.tools.bd;
import com.tencent.mm.sdk.modelmsg.WXFileObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class ho
  implements View.OnDragListener
{
  ho(hn paramhn)
  {
  }

  public final boolean onDrag(View paramView, DragEvent paramDragEvent)
  {
    int i = 1;
    switch (paramDragEvent.getAction())
    {
    default:
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "Unknown action type received by OnDragListener.");
      i = 0;
    case 1:
    case 5:
    case 2:
    case 4:
    case 3:
    }
    ClipData localClipData;
    do
    {
      return i;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ACTION_DRAG_STARTED");
      return i;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ACTION_DRAG_ENTERED");
      return i;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ACTION_DRAG_LOCATION");
      return i;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ACTION_DRAG_ENDED");
      return i;
      z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "ACTION_DROP");
      localClipData = paramDragEvent.getClipData();
    }
    while (localClipData == null);
    int j = localClipData.getItemCount();
    int k = 0;
    label115: ClipData.Item localItem;
    if (k < j)
    {
      localItem = localClipData.getItemAt(k);
      if (localItem != null)
        break label149;
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "item == null");
    }
    while (true)
    {
      k++;
      break label115;
      break;
      label149: if (localItem.getIntent() != null)
      {
        this.jtD.jtA.startActivity(localItem.getIntent());
      }
      else if (localItem.getUri() != null)
      {
        bd localbd = new bd(this.jtD.jtA.agh(), localItem.getUri());
        if ((localbd.hMx != 0) && (localbd.filePath != null));
        switch (localbd.hMx)
        {
        default:
          cx localcx = cx.rV();
          Object[] arrayOfObject = new Object[i];
          arrayOfObject[0] = Integer.valueOf(i);
          localcx.a(38, arrayOfObject);
          hd.a(this.jtD.jtA, localbd.filePath);
          WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXFileObject(hd.ag(this.jtD.jtA)));
          localWXMediaMessage.title = new File(hd.ag(this.jtD.jtA)).getName();
          localWXMediaMessage.description = ch.Z(c.ab(hd.ag(this.jtD.jtA)));
          k localk = new k();
          localk.field_appId = "wx4310bbd51be7d979";
          bf.GO().c(localk, new String[0]);
          s.a(localWXMediaMessage, localk.field_appId, localk.field_appName, this.jtD.jtA.aUL(), 2, null);
          break;
        case 3:
          hd.a(this.jtD.jtA, localbd.filePath);
          boolean bool = x.b(hd.ag(this.jtD.jtA), this.jtD.jtA.aUL(), i);
          hd localhd = this.jtD.jtA;
          if (bool);
          int n;
          for (int m = i; ; n = 0)
          {
            hd.a(localhd, m, hd.ag(this.jtD.jtA));
            break;
          }
        case 4:
          Intent localIntent = new Intent();
          localIntent.setData(localItem.getUri());
          hd.b(this.jtD.jtA, localIntent);
          continue;
          z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "get file path failed");
          break;
        }
      }
      else if ((localItem.getText() != null) && (localItem.getText().length() > 0))
      {
        this.jtD.jtA.Cn(localItem.getText().toString());
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ho
 * JD-Core Version:    0.6.2
 */