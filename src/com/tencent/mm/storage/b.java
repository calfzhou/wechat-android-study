package com.tencent.mm.storage;

import com.tencent.mm.c.b.f;
import com.tencent.mm.e.a.a.a;
import com.tencent.mm.protocal.a.dk;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b extends f
{
  protected static ae dhu = localae;
  private a ihR = new a();
  public a ihS = this.ihR;
  private List ihT = new LinkedList();
  private Map ihU = new HashMap();

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[13];
    localae.dhI = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "chatroomname";
    localae.iGy.put("chatroomname", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" chatroomname TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "chatroomname";
    localae.dhI[1] = "addtime";
    localae.iGy.put("addtime", "LONG");
    localStringBuilder.append(" addtime LONG");
    localStringBuilder.append(", ");
    localae.dhI[2] = "memberlist";
    localae.iGy.put("memberlist", "TEXT");
    localStringBuilder.append(" memberlist TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "displayname";
    localae.iGy.put("displayname", "TEXT");
    localStringBuilder.append(" displayname TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "chatroomnick";
    localae.iGy.put("chatroomnick", "TEXT");
    localStringBuilder.append(" chatroomnick TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "roomflag";
    localae.iGy.put("roomflag", "INTEGER");
    localStringBuilder.append(" roomflag INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "roomowner";
    localae.iGy.put("roomowner", "TEXT");
    localStringBuilder.append(" roomowner TEXT");
    localStringBuilder.append(", ");
    localae.dhI[7] = "roomdata";
    localae.iGy.put("roomdata", "BLOB");
    localStringBuilder.append(" roomdata BLOB");
    localStringBuilder.append(", ");
    localae.dhI[8] = "isShowname";
    localae.iGy.put("isShowname", "INTEGER");
    localStringBuilder.append(" isShowname INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[9] = "selfDisplayName";
    localae.iGy.put("selfDisplayName", "TEXT");
    localStringBuilder.append(" selfDisplayName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "style";
    localae.iGy.put("style", "INTEGER");
    localStringBuilder.append(" style INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[11] = "chatroomdataflag";
    localae.iGy.put("chatroomdataflag", "INTEGER");
    localStringBuilder.append(" chatroomdataflag INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[12] = "modifytime";
    localae.iGy.put("modifytime", "LONG");
    localStringBuilder.append(" modifytime LONG");
    localae.dhI[13] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  private void a(a parama)
  {
    if (this.field_roomdata == null)
      parama = new a();
    Iterator localIterator = parama.dJw.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.e.a.a.b localb = (com.tencent.mm.e.a.a.b)localIterator.next();
      this.ihU.put(localb.cDi, localb);
    }
  }

  private void aHZ()
  {
    try
    {
      this.ihS = new a().k(this.field_roomdata);
      a(this.ihS);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        this.ihS = new a();
    }
  }

  private boolean b(a parama)
  {
    return this.ihR.hD() == parama.hD();
  }

  private static int hd(String paramString)
  {
    try
    {
      int j = Integer.parseInt(paramString);
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      do
        int i = 0;
      while (paramString == null);
      z.e("!32@/B4Tb64lLpLmGcw7XyPCjtlJyX0v8EQk", "parserInt error " + paramString);
    }
    return 0;
  }

  private static a xQ(String paramString)
  {
    a locala = new a();
    if (ch.jb(paramString))
      return locala;
    int i = paramString.indexOf('<');
    if (i > 0)
      paramString = paramString.substring(i);
    Map localMap = x.bB(paramString, "RoomData");
    if (localMap == null)
    {
      z.e("!32@/B4Tb64lLpLmGcw7XyPCjtlJyX0v8EQk", "parse RoomData failed");
      return null;
    }
    int j = 0;
    while (true)
    {
      try
      {
        com.tencent.mm.e.a.a.b localb = new com.tencent.mm.e.a.a.b();
        if (j == 0)
        {
          localObject1 = ".RoomData.Member.$UserName";
          localObject2 = ".RoomData.Member.DisplayName";
          localObject3 = ".RoomData.Member.Flag";
          String str4 = ch.Y((String)localMap.get(localObject1), "");
          if (ch.jb(str4))
            continue;
          localb.cDi = str4;
          localb.dbG = ch.Y((String)localMap.get(localObject2), "");
          localb.dJz = hd((String)localMap.get(localObject3));
          locala.dJw.add(localb);
          j++;
          continue;
        }
        if (j != 0)
        {
          String str1 = ".RoomData.Member" + j + ".$UserName";
          String str2 = ".RoomData.Member" + j + ".DisplayName";
          String str3 = ".RoomData.Member" + j + ".Flag";
          localObject1 = str1;
          localObject2 = str2;
          localObject3 = str3;
          continue;
          locala.type = hd((String)localMap.get(".RoomData.Type"));
          locala.status = hd((String)localMap.get(".RoomData.Status"));
          locala.yz = hd((String)localMap.get(".RoomData.MaxCount"));
          locala.dJx = ch.Y((String)localMap.get(".RoomData.ExtInfo.Upgrader"), "");
          return locala;
        }
      }
      catch (Exception localException)
      {
        return locala;
      }
      Object localObject1 = null;
      Object localObject3 = null;
      Object localObject2 = null;
    }
  }

  public static List xR(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    if (ch.jb(paramString))
      return localLinkedList;
    String[] arrayOfString = paramString.split(";");
    for (int i = 0; i < arrayOfString.length; i++)
      localLinkedList.add(arrayOfString[i]);
    return localLinkedList;
  }

  public final b a(String paramString, a parama, boolean paramBoolean)
  {
    this.field_modifytime = System.currentTimeMillis();
    Object localObject1;
    Object localObject2;
    if (!paramBoolean)
    {
      localObject1 = null;
      Iterator localIterator = parama.dJw.iterator();
      if (localIterator.hasNext())
      {
        localObject2 = (com.tencent.mm.e.a.a.b)localIterator.next();
        if ((((com.tencent.mm.e.a.a.b)localObject2).cDi == null) || (!((com.tencent.mm.e.a.a.b)localObject2).cDi.equals(paramString)))
          break label203;
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      break;
      if (localObject1 != null)
      {
        this.field_selfDisplayName = localObject1.dbG;
        this.field_isShowname = (0x1 & localObject1.dJz);
      }
      for (int i = localObject1.dJz; ; i = 0)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = this.field_selfDisplayName;
        arrayOfObject[1] = Integer.valueOf(this.field_chatroomdataflag);
        arrayOfObject[2] = Integer.valueOf(i);
        z.d("!32@/B4Tb64lLpLmGcw7XyPCjtlJyX0v8EQk", "displayName[%s] roomFlag[%d] flag[%d]", arrayOfObject);
        parama.cGN = (0xFFFFFFFD & parama.cGN | i & 0x2);
        this.field_chatroomdataflag = parama.cGN;
        try
        {
          this.field_roomdata = parama.toByteArray();
          this.ihS = parama;
          label185: a(parama);
          return this;
        }
        catch (Exception localException)
        {
          break label185;
        }
      }
      label203: localObject2 = localObject1;
    }
  }

  public final b aE(List paramList)
  {
    String str;
    if ((paramList == null) || (paramList.size() == 0))
      str = "";
    while (true)
    {
      this.field_memberlist = str;
      return this;
      str = "";
      for (int i = 0; i < paramList.size(); i++)
      {
        str = str + (String)paramList.get(i);
        if (i < -1 + paramList.size())
          str = str + ";";
      }
    }
  }

  public final List aHY()
  {
    if ((this.ihT == null) || (this.ihT.size() == 0))
      this.ihT = xR(this.field_memberlist);
    return this.ihT;
  }

  public final int aIa()
  {
    if (b(this.ihS))
      aHZ();
    return this.ihS.cLj;
  }

  public final boolean aIb()
  {
    if (b(this.ihS))
      aHZ();
    return this.ihS.cLj < this.ihS.dJy;
  }

  public final int aIc()
  {
    if (b(this.ihS))
      aHZ();
    return this.ihS.yz;
  }

  public final boolean aId()
  {
    return this.field_isShowname > 0;
  }

  public final b bq(String paramString1, String paramString2)
  {
    return a(paramString1, xQ(paramString2), false);
  }

  public final void cl(int paramInt)
  {
    this.field_chatroomdataflag = (0xFFFFFFFD & this.ihS.cGN | paramInt & 0x2);
  }

  public final String dh(String paramString)
  {
    com.tencent.mm.e.a.a.b localb = xP(paramString);
    if (localb == null)
      return "";
    return ch.Y(localb.dbG, "");
  }

  public final b eg(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.field_isShowname = i;
      return this;
    }
  }

  public final void h(String paramString, List paramList)
  {
    if (b(this.ihS))
      aHZ();
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      dk localdk = (dk)localIterator1.next();
      if (this.ihU.containsKey(localdk.gnq))
      {
        com.tencent.mm.e.a.a.b localb = (com.tencent.mm.e.a.a.b)this.ihU.get(localdk.gnq);
        localb.dbG = localdk.hTx;
        localb.dJz = localdk.hTA;
      }
    }
    this.ihS.dJw.clear();
    Iterator localIterator2 = this.ihU.keySet().iterator();
    while (localIterator2.hasNext())
    {
      String str = (String)localIterator2.next();
      this.ihS.dJw.add(this.ihU.get(str));
    }
    a(paramString, this.ihS, false);
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final void nX(int paramInt)
  {
    if (b(this.ihS))
      aHZ();
    this.ihS.cLj = paramInt;
    try
    {
      this.field_roomdata = this.ihS.toByteArray();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final com.tencent.mm.e.a.a.b xP(String paramString)
  {
    if (this.ihU.size() <= 0)
      aHZ();
    if (this.ihU.containsKey(paramString))
      return (com.tencent.mm.e.a.a.b)this.ihU.get(paramString);
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.b
 * JD-Core Version:    0.6.2
 */