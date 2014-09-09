package com.tencent.mm.protocal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.protocal.a.pp;
import com.tencent.mm.sdk.platformtools.z;

public class JsapiPermissionWrapper
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new i();
  public static final JsapiPermissionWrapper hNg = new JsapiPermissionWrapper(-1, -5, -1);
  public static final JsapiPermissionWrapper hNh = new JsapiPermissionWrapper(0, 0, 0);
  private int hNf;
  private int hNi;
  private int hNj;
  public int hNk = 0;
  public int hNl = 0;
  public int hNm = 0;
  public int hNn = 0;
  public int hNo = 0;

  public JsapiPermissionWrapper()
  {
    this.hNf = 0;
    this.hNi = 0;
    this.hNj = 0;
  }

  public JsapiPermissionWrapper(int paramInt1, int paramInt2, int paramInt3)
  {
    this.hNf = paramInt1;
    this.hNi = paramInt2;
    this.hNj = paramInt3;
    z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "edw <init>, " + this);
  }

  private JsapiPermissionWrapper(Parcel paramParcel)
  {
    this.hNf = paramParcel.readInt();
    this.hNi = paramParcel.readInt();
    this.hNj = paramParcel.readInt();
    this.hNk = paramParcel.readInt();
    this.hNl = paramParcel.readInt();
    this.hNm = paramParcel.readInt();
    this.hNn = paramParcel.readInt();
    this.hNo = paramParcel.readInt();
  }

  public JsapiPermissionWrapper(pp parampp)
  {
    this.hNf = parampp.iak;
    this.hNi = parampp.ifu;
    this.hNj = parampp.ifv;
    z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "edw <init>, " + this);
  }

  public final boolean aFA()
  {
    boolean bool = true;
    if (this.hNk > 0)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowProfile true, hit limit times = " + this.hNk);
      this.hNk = (-1 + this.hNk);
      return bool;
    }
    if ((0x4 & this.hNf) != 0);
    while (true)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowProfile, ret = " + bool);
      return bool;
      bool = false;
    }
  }

  public final boolean aFB()
  {
    if ((0x8000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenProductView, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFC()
  {
    if ((0x10000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenProductView, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFD()
  {
    boolean bool = true;
    if (this.hNm > 0)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShareWeibo true, hit limit times = " + this.hNm);
      this.hNm = (-1 + this.hNm);
      return bool;
    }
    if ((0x8 & this.hNf) != 0);
    while (true)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShareWeibo, ret = " + bool);
      return bool;
      bool = false;
    }
  }

  public final boolean aFE()
  {
    boolean bool = true;
    if (this.hNn > 0)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShareTimeline true, hit limit times = " + this.hNn);
      this.hNn = (-1 + this.hNn);
      return bool;
    }
    if ((0x10 & this.hNf) != 0);
    while (true)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShareTimeline, ret = " + bool);
      return bool;
      bool = false;
    }
  }

  public final boolean aFF()
  {
    if ((0x20 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowAddContact, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFG()
  {
    boolean bool = true;
    if (this.hNl > 0)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSendAppMsg true, hit limit times = " + this.hNl);
      this.hNl = (-1 + this.hNl);
      return bool;
    }
    if ((0x40 & this.hNf) != 0);
    while (true)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSendAppMsg, ret = " + bool);
      return bool;
      bool = false;
    }
  }

  public final boolean aFM()
  {
    if ((0x80 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowScanQrcode, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFN()
  {
    if ((0x100 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowAddEmoticon, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFO()
  {
    if ((0x200 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowHasEmoticon, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFP()
  {
    if ((0x400 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowCancelAddEmoticon, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFQ()
  {
    if ((0x4000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowHideOptionMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFR()
  {
    if ((0x8000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShowOptionMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFS()
  {
    if ((0x10000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGetNetworkType, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFT()
  {
    if ((0x20000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowCloseWindow, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFU()
  {
    if ((0x40000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowFontMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFV()
  {
    if ((0x80000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowProfileMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFW()
  {
    if ((0x100000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowAddContactMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFX()
  {
    if ((0x200000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSendAppMsgMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFY()
  {
    if ((0x800000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShareTimelineMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFZ()
  {
    if ((0x1000000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowDownloadInWebView, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFy()
  {
    if ((0x1 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowLog, ret = " + bool);
      return bool;
    }
  }

  public final boolean aFz()
  {
    if ((0x2 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowImagePreview, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGA()
  {
    if ((0x80000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenLocation, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGE()
  {
    if ((0x40000000 & this.hNi) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "alloOpenTimeLinee, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGF()
  {
    if ((0x1 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowCheckInTIimeLine, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGG()
  {
    if ((0x2 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenWXCredit, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGH()
  {
    if ((0x8 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSendServiceAppMsg, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGI()
  {
    if ((0x80 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowConnectToWifi, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGJ()
  {
    if ((0x20 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowPlayMusic, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGK()
  {
    return (0x200 & this.hNj) > 0;
  }

  public final boolean aGL()
  {
    if ((0x400 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGetTransferMoneyRequest, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGM()
  {
    if ((0x10 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenCardDetail, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGN()
  {
    if ((0x40 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowChooseCard, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGO()
  {
    if ((0x800 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShowWxSafeLogin, ret = %b", arrayOfObject);
      return bool;
    }
  }

  public final boolean aGP()
  {
    if ((0x2000 & this.hNj) > 0);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSetCloseWindowConfirmDialogInfo, ret = %b", arrayOfObject);
      return bool;
    }
  }

  public final boolean aGa()
  {
    if ((0x2000000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGetIntallState, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGb()
  {
    if ((0x4000000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowJumpToInstallUrl, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGc()
  {
    if ((0x10000000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowDoPay, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGd()
  {
    if ((0x20000000 & this.hNf) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowEditTransactionAddressReq, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGe()
  {
    if ((0x4000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGetRecentlyUserdAddressReq, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGf()
  {
    if ((0x2 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGetHeadingAndPitch, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGg()
  {
    boolean bool = true;
    if (this.hNo > 0)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "sendMailTimes true, hit limit times = " + this.hNo);
      this.hNo = (-1 + this.hNo);
      return bool;
    }
    if ((0x8 & this.hNi) != 0);
    while (true)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSendMail, ret = " + bool);
      return bool;
      bool = false;
    }
  }

  public final boolean aGh()
  {
    if ((0x10 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowSendMainMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGi()
  {
    if ((0x40 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowAddDownloadTask, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGj()
  {
    if ((0x80 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowCancelDownloadTask, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGk()
  {
    if ((0x100 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowQueryDownloadTask, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGl()
  {
    if ((0x200 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowInstallDownloadTask, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGm()
  {
    if ((0x400 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowNotifyDownloadTaskState, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGn()
  {
    if ((0x800 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShareToBrandMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGo()
  {
    if ((0x1000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowCopyUrlMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGp()
  {
    if ((0x2000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenWithBrowserMenu, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGq()
  {
    if ((0x4 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowShowWeixinCertified, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGr()
  {
    if ((0x10000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenSpecificView, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGs()
  {
    if ((0x100000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowLaunch3RdApp, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGt()
  {
    if ((0x200000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowWriteCommData, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGu()
  {
    if ((0x80000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowAddDownloadTask, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGv()
  {
    if ((0x800000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenUrlByExtBrowser, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGw()
  {
    if ((0x1000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowOpenFileChooser, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGx()
  {
    if ((0x4000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGetBrandWCPayBindCardRequest, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGy()
  {
    if ((0x2000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowGeoLocation, ret = " + bool);
      return bool;
    }
  }

  public final boolean aGz()
  {
    if ((0x20000000 & this.hNi) != 0);
    for (boolean bool = true; ; bool = false)
    {
      z.d("!44@/B4Tb64lLpJGrp3jueSX7a0O+uIaXB6eg8mTj+F44r0=", "allowJumpBizProfile, ret = " + bool);
      return bool;
    }
  }

  public final void d(Bundle paramBundle)
  {
    paramBundle.putInt("jsapi_perm_wrapper_bitset", this.hNf);
    paramBundle.putInt("jsapi_perm_wrapper_bitset2", this.hNi);
    paramBundle.putInt("jsapi_perm_wrapper_bitset3", this.hNj);
    paramBundle.putInt("jsapi_perm_wrapper_profileLimitTimes", this.hNk);
    paramBundle.putInt("jsapi_perm_wrapper_sendAppMsgLimitTimes", this.hNl);
    paramBundle.putInt("jsapi_perm_wrapper_shareWeiboLimitTimes", this.hNm);
    paramBundle.putInt("jsapi_perm_wrapper_shareTimelineLimitTimes", this.hNn);
    paramBundle.putInt("jsapi_perm_wrapper_sendMailTimes", this.hNo);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void e(Bundle paramBundle)
  {
    this.hNf = paramBundle.getInt("jsapi_perm_wrapper_bitset");
    this.hNi = paramBundle.getInt("jsapi_perm_wrapper_bitset2");
    this.hNj = paramBundle.getInt("jsapi_perm_wrapper_bitset3");
    this.hNk = paramBundle.getInt("jsapi_perm_wrapper_profileLimitTimes");
    this.hNl = paramBundle.getInt("jsapi_perm_wrapper_sendAppMsgLimitTimes");
    this.hNm = paramBundle.getInt("jsapi_perm_wrapper_shareWeiboLimitTimes");
    this.hNn = paramBundle.getInt("jsapi_perm_wrapper_shareTimelineLimitTimes");
    this.hNo = paramBundle.getInt("jsapi_perm_wrapper_sendMailTimes");
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof JsapiPermissionWrapper));
    JsapiPermissionWrapper localJsapiPermissionWrapper;
    do
    {
      return false;
      localJsapiPermissionWrapper = (JsapiPermissionWrapper)paramObject;
    }
    while ((this.hNf != localJsapiPermissionWrapper.hNf) || (this.hNi != localJsapiPermissionWrapper.hNi) || (this.hNj != localJsapiPermissionWrapper.hNj));
    return true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[bitset=0x");
    localStringBuilder.append(Integer.toHexString(this.hNf));
    localStringBuilder.append(", bitset2=0x");
    localStringBuilder.append(Integer.toHexString(this.hNi));
    localStringBuilder.append(", bitset3=0x");
    localStringBuilder.append(Integer.toHexString(this.hNj));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.hNf);
    paramParcel.writeInt(this.hNi);
    paramParcel.writeInt(this.hNj);
    paramParcel.writeInt(this.hNk);
    paramParcel.writeInt(this.hNl);
    paramParcel.writeInt(this.hNm);
    paramParcel.writeInt(this.hNn);
    paramParcel.writeInt(this.hNo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.JsapiPermissionWrapper
 * JD-Core Version:    0.6.2
 */