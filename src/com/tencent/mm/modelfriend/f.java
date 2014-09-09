package com.tencent.mm.modelfriend;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.cs;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class f extends Thread
{
  private static byte[] dcy = new byte[0];
  public static boolean dsC = false;
  private static final cm jwZ = new g(Looper.getMainLooper());
  private List dsO;
  private List dsP;
  private List dsQ;
  private List dsR;
  private cs dsS;

  public f()
  {
    super("addrbook-reader");
    setPriority(1);
  }

  private static List a(int paramInt, List paramList)
  {
    if (paramList == null)
    {
      z.e("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync address book failed, null info list");
      return new LinkedList();
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String[] arrayOfString = (String[])localIterator.next();
      if (arrayOfString != null)
      {
        String str1 = arrayOfString[0];
        String str2 = arrayOfString[1];
        String str3 = arrayOfString[2];
        String str4 = arrayOfString[3];
        long l = ch.xz(arrayOfString[4]);
        if ((str3 != null) && (!str3.equals("")))
        {
          String str5 = "";
          if (paramInt == 1)
            str5 = com.tencent.mm.a.f.d(str3.getBytes());
          if (paramInt == 0)
          {
            String str6 = a.pR(str3);
            if (ch.jb(str6))
              z.d("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "formatted mobile null, continue");
            else
              str5 = com.tencent.mm.a.f.d(str6.getBytes());
          }
          else
          {
            i locali = new i();
            locali.fU(str2);
            locali.fV(com.tencent.mm.platformtools.f.jw(str2));
            locali.fW(com.tencent.mm.platformtools.f.jv(str2));
            locali.fT(str1);
            locali.gj(str4);
            locali.fS(str5);
            locali.H(l);
            if (paramInt == 1)
              locali.bd(str3);
            if (paramInt == 0)
              locali.ga(str3);
            locali.setType(paramInt);
            locali.db(47222);
            localArrayList.add(locali);
          }
        }
      }
    }
    return localArrayList;
  }

  private static List a(List paramList, int paramInt1, int paramInt2)
  {
    LinkedList localLinkedList = new LinkedList();
    while (paramInt1 < paramInt2)
    {
      localLinkedList.add(paramList.get(paramInt1));
      paramInt1++;
    }
    return localLinkedList;
  }

  private static void vs()
  {
    cs localcs = new cs("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "delete");
    ArrayList localArrayList = new ArrayList();
    List localList = a.ba(ak.getContext());
    Iterator localIterator = az.wZ().vM().iterator();
    while (localIterator.hasNext())
    {
      String[] arrayOfString = (String[])localIterator.next();
      String str1 = ch.ja(arrayOfString[0]);
      String str2 = ch.ja(arrayOfString[1]);
      if ((!str1.equals("")) && (!localList.contains(str1)))
        localArrayList.add(str2);
    }
    if (localArrayList.size() > 0)
    {
      az.wZ().h(localArrayList);
      aa.k(localArrayList);
    }
    localcs.addSplit("end");
    localcs.dumpToLog();
  }

  public final void run()
  {
    while (true)
    {
      synchronized (dcy)
      {
        this.dsS = new cs("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync addrBook");
        this.dsS.addSplit("sync begin");
        z.d("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "reading email info");
        this.dsO = a.aZ(ak.getContext());
        if (this.dsO != null)
          z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync address book email size: " + this.dsO.size());
        this.dsR = a(1, this.dsO);
        z.d("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "reading mobile info");
        this.dsP = a.aX(ak.getContext());
        if (this.dsP != null)
          z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync address book mobile size: " + this.dsP.size());
        this.dsQ = a(0, this.dsP);
        z.d("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "reading done, begin sync to addr_upload");
        if ((this.dsO != null) && (this.dsR.size() > 0))
        {
          int k = 0;
          if (k < this.dsR.size())
          {
            z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync email index: " + k);
            if (k + 100 < this.dsR.size())
            {
              localList2 = a(this.dsR, k, k + 100);
              z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync email listToSync size: " + localList2.size());
              aa.l(localList2);
              k += 100;
              continue;
            }
            List localList2 = a(this.dsR, k, this.dsR.size());
            continue;
          }
        }
        if ((this.dsQ != null) && (this.dsQ.size() != 0))
          break label665;
        z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "mobile list null stop service");
        Message localMessage1 = jwZ.obtainMessage();
        localMessage1.obj = Boolean.valueOf(false);
        jwZ.sendMessage(localMessage1);
        return;
        if (i >= this.dsQ.size())
          break label561;
        z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync mobile index: " + i);
        if (!bg.oE())
        {
          z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "account not ready, stop sync");
          Message localMessage4 = jwZ.obtainMessage();
          localMessage4.obj = Boolean.valueOf(false);
          jwZ.sendMessage(localMessage4);
          return;
        }
      }
      int j = i + 100;
      if (j < this.dsQ.size());
      for (List localList1 = a(this.dsQ, i, i + 100); ; localList1 = a(this.dsQ, i, this.dsQ.size()))
      {
        z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync mobile listToSync size: " + localList1.size());
        aa.l(localList1);
        i += 100;
        break;
      }
      label561: z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "sync ok");
      if (!bg.oE())
      {
        z.i("!44@/B4Tb64lLpKsaaaeu1U1LvE9rg8EoeqFZ8tU4LT5XLw=", "account not ready, exit");
        Message localMessage3 = jwZ.obtainMessage();
        localMessage3.obj = Boolean.valueOf(false);
        jwZ.sendMessage(localMessage3);
        return;
      }
      vs();
      System.currentTimeMillis();
      this.dsS.addSplit("sync ok");
      this.dsS.dumpToLog();
      Message localMessage2 = jwZ.obtainMessage();
      localMessage2.obj = Boolean.valueOf(true);
      jwZ.sendMessage(localMessage2);
      return;
      label665: int i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.f
 * JD-Core Version:    0.6.2
 */