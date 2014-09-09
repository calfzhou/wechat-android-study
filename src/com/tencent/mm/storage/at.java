package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class at
{
  private int cGQ = 0;
  private double eSc = 0.0D;
  private double eSd = 0.0D;
  private String eXy = "";
  private String ijF = "";
  private String ijG = null;
  private String ijH = null;
  private String ijI = null;
  private String ijJ = "";
  private String ijw = "";
  private String label = "";

  public static at zm(String paramString)
  {
    at localat = new at();
    Map localMap = x.bB(paramString, "msg");
    if (localMap != null)
    {
      localat.ijw = ch.Y((String)localMap.get(".msg.location.$fromusername"), "");
      localat.eSc = ch.xA((String)localMap.get(".msg.location.$x"));
      localat.eSd = ch.xA((String)localMap.get(".msg.location.$y"));
      localat.label = ch.Y((String)localMap.get(".msg.location.$label"), "");
      localat.ijF = ch.Y((String)localMap.get(".msg.location.$maptype"), "");
      localat.cGQ = ch.xy((String)localMap.get(".msg.location.$scale"));
      localat.ijI = ch.Y((String)localMap.get(".msg.location.$localLocationen"), "");
      localat.ijG = ch.Y((String)localMap.get(".msg.location.$localLocationcn"), "");
      localat.ijH = ch.Y((String)localMap.get(".msg.location.$localLocationtw"), "");
      localat.eXy = ch.Y((String)localMap.get(".msg.location.$poiname"), "");
      localat.ijJ = ch.Y((String)localMap.get(".msg.location.$infourl"), "");
    }
    return localat;
  }

  public final int aEX()
  {
    return this.cGQ;
  }

  public final String aJY()
  {
    return this.eXy;
  }

  public final boolean aJZ()
  {
    return (this.eXy != null) && (!this.eXy.equals(""));
  }

  public final double aKa()
  {
    return this.eSc;
  }

  public final double aKb()
  {
    return this.eSd;
  }

  public final String aKc()
  {
    return this.ijJ;
  }

  public final String getLabel()
  {
    return this.label;
  }

  public final String h(boolean paramBoolean, String paramString)
  {
    if ((this.ijI == null) || (this.ijI.equals("")))
      this.ijI = "";
    if ((this.ijH == null) || (this.ijH.equals("")))
      this.ijI = "";
    if ((this.ijG == null) || (this.ijG.equals("")))
      this.ijG = "";
    if ((this.ijw == null) || (this.ijw.equals("")))
      this.ijw = "";
    if ((this.label == null) || (this.label.equals("")))
      this.label = "";
    if ((this.ijF == null) || (this.ijF.equals("")))
      this.ijF = "";
    String str = "<msg><location x=\"" + this.eSc + "\" y=\"" + this.eSd + "\" scale=\"" + this.cGQ + "\" label=\"" + this.label + "\" maptype=\"" + this.ijF + "\"  fromusername=\"" + this.ijw + "\" /></msg>";
    if ((paramBoolean) && (!paramString.equals("")))
      str = paramString + ":\n" + str;
    return str;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf((int)(1000000.0D * this.eSc));
    arrayOfObject[1] = Integer.valueOf((int)(1000000.0D * this.eSd));
    arrayOfObject[2] = Integer.valueOf(this.cGQ);
    return String.format("%d-%d-%d", arrayOfObject);
  }

  public final void zn(String paramString)
  {
    this.label = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.at
 * JD-Core Version:    0.6.2
 */