package com.tencent.mm.ui.chatting;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.v;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import java.util.Iterator;
import java.util.List;

public final class bs
{
  public static boolean a(hd paramhd, List paramList, i parami)
  {
    if (paramhd == null)
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXpUaRGiiWUlQHRk1Z/SvIxQ==", "do send to mail fail, context is null");
      return false;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXpUaRGiiWUlQHRk1Z/SvIxQ==", "do send to mail fail, select item empty");
      return false;
    }
    if ((parami == null) || ((int)parami.dhv <= 0))
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXpUaRGiiWUlQHRk1Z/SvIxQ==", "do send to mail fail, contact error");
      return false;
    }
    return b(paramhd, paramList, parami);
  }

  private static boolean b(hd paramhd, List paramList, i parami)
  {
    String str2;
    if (!parami.getUsername().endsWith("@chatroom"))
    {
      String str7 = paramhd.getString(com.tencent.mm.n.cei);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = parami.oc();
      arrayOfObject2[1] = bg.qW().oQ().get(4);
      str2 = String.format(str7, arrayOfObject2);
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(7);
      arrayOfObject1[1] = Integer.valueOf(paramList.size());
      localn.d(10811, arrayOfObject1);
      if ((0x1 & x.pO()) == 0)
      {
        z.d("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXpUaRGiiWUlQHRk1Z/SvIxQ==", "use qq mail plugin to send mail");
        String str4 = new QQMailHistoryExporter(paramhd.agh(), paramList, parami).aWs();
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("mail_mode", 6);
        localIntent2.putExtra("mail_content", str4);
        localIntent2.putExtra("subject", str2);
        localIntent2.putExtra("show_qqmail", true);
        com.tencent.mm.am.a.a(paramhd, "qqmail", ".ui.ComposeUI", localIntent2, 220);
        return false;
      }
    }
    else
    {
      String str5;
      if (ch.jb(parami.iV()))
      {
        Iterator localIterator = v.cU(parami.getUsername()).iterator();
        String str6;
        for (str5 = ""; localIterator.hasNext(); str5 = str5 + str6 + ", ")
          str6 = y.dh((String)localIterator.next());
      }
      for (String str1 = str5.substring(0, -2 + str5.length()); ; str1 = parami.oc())
      {
        str2 = String.format(paramhd.getString(com.tencent.mm.n.cej), new Object[] { str1 });
        break;
      }
    }
    z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXpUaRGiiWUlQHRk1Z/SvIxQ==", "use order mail app to send mail");
    mv localmv = new mv(paramhd.agh(), paramList, parami);
    String str3 = localmv.aWs();
    Intent localIntent1 = new Intent("android.intent.action.SEND_MULTIPLE");
    localIntent1.setType("message/rfc822");
    localIntent1.putExtra("android.intent.extra.SUBJECT", str2);
    localIntent1.putExtra("android.intent.extra.TEXT", str3);
    localIntent1.putParcelableArrayListExtra("android.intent.extra.STREAM", localmv.aWr());
    try
    {
      paramhd.startActivity(Intent.createChooser(localIntent1, paramhd.getString(com.tencent.mm.n.ceh)));
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        Toast.makeText(paramhd.agh(), com.tencent.mm.n.cek, 0).show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bs
 * JD-Core Version:    0.6.2
 */