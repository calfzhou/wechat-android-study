package com.tencent.mm.compatible.c;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

final class y
{
  public static boolean a(String paramString, s params, b paramb, a parama, n paramn, z paramz, aa paramaa)
  {
    try
    {
      Map localMap = x.bB(paramString, "voip");
      if (localMap == null)
        return false;
      if (localMap.get(".voip.cpu.armv7") != null)
      {
        params.dNr = Integer.parseInt((String)localMap.get(".voip.cpu.armv7"));
        params.dNq = true;
      }
      if (localMap.get(".voip.cpu.armv6") != null)
      {
        params.dNs = Integer.parseInt((String)localMap.get(".voip.cpu.armv6"));
        params.dNq = true;
      }
      if (localMap.get(".voip.camera.num") != null)
      {
        paramb.dLT = Integer.parseInt((String)localMap.get(".voip.camera.num"));
        paramb.dLS = true;
      }
      if (localMap.get(".voip.camera.surface") != null)
      {
        paramb.dLV = Integer.parseInt((String)localMap.get(".voip.camera.surface"));
        paramb.dLU = true;
      }
      if (localMap.get(".voip.camera.format") != null)
      {
        paramb.dLX = Integer.parseInt((String)localMap.get(".voip.camera.format"));
        paramb.dLW = true;
      }
      if (localMap.get(".voip.camera.back.enable") != null)
      {
        paramb.dMb.dMn = Integer.parseInt((String)localMap.get(".voip.camera.back.enable"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.back.fps") != null)
      {
        paramb.dMb.tj = Integer.parseInt((String)localMap.get(".voip.camera.back.fps"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.back.orien") != null)
      {
        paramb.dMb.dMo = Integer.parseInt((String)localMap.get(".voip.camera.back.orien"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.back.rotate") != null)
      {
        paramb.dMb.dMp = Integer.parseInt((String)localMap.get(".voip.camera.back.rotate"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.back.isleft") != null)
      {
        paramb.dMb.dMq = Integer.parseInt((String)localMap.get(".voip.camera.back.isleft"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.back.width") != null)
      {
        paramb.dMb.width = Integer.parseInt((String)localMap.get(".voip.camera.back.width"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.back.height") != null)
      {
        paramb.dMb.height = Integer.parseInt((String)localMap.get(".voip.camera.back.height"));
        paramb.dMa = true;
      }
      if (localMap.get(".voip.camera.front.enable") != null)
      {
        paramb.dLZ.dMn = Integer.parseInt((String)localMap.get(".voip.camera.front.enable"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.front.fps") != null)
      {
        paramb.dLZ.tj = Integer.parseInt((String)localMap.get(".voip.camera.front.fps"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.front.orien") != null)
      {
        paramb.dLZ.dMo = Integer.parseInt((String)localMap.get(".voip.camera.front.orien"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.front.rotate") != null)
      {
        paramb.dLZ.dMp = Integer.parseInt((String)localMap.get(".voip.camera.front.rotate"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.front.isleft") != null)
      {
        paramb.dLZ.dMq = Integer.parseInt((String)localMap.get(".voip.camera.front.isleft"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.front.width") != null)
      {
        paramb.dLZ.width = Integer.parseInt((String)localMap.get(".voip.camera.front.width"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.front.height") != null)
      {
        paramb.dLZ.height = Integer.parseInt((String)localMap.get(".voip.camera.front.height"));
        paramb.dLY = true;
      }
      if (localMap.get(".voip.camera.videorecord.frotate") != null)
      {
        paramb.dMd = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.frotate"));
        paramb.dMc = true;
      }
      if (localMap.get(".voip.camera.videorecord.forientation") != null)
      {
        paramb.dMe = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.forientation"));
        paramb.dMc = true;
      }
      if (localMap.get(".voip.camera.videorecord.brotate") != null)
      {
        paramb.dMf = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.brotate"));
        paramb.dMc = true;
      }
      if (localMap.get(".voip.camera.videorecord.borientation") != null)
      {
        paramb.dMg = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.borientation"));
        paramb.dMc = true;
      }
      if (localMap.get(".voip.camera.videorecord.num") != null)
      {
        paramb.dMi = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.num"));
        paramb.dMj = true;
        paramb.dMc = true;
      }
      if (localMap.get(".voip.camera.videorecord.api20") != null)
        paramb.dMk = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.api20"));
      if (localMap.get(".voip.camera.setframerate") != null)
        paramb.dMh = Integer.parseInt((String)localMap.get(".voip.camera.setframerate"));
      if (localMap.get(".voip.camera.scannerFocusThreshold") != null)
        paramb.dMl = Integer.parseInt((String)localMap.get(".voip.camera.scannerFocusThreshold"));
      if (localMap.get(".voip.camera.scannerImageQuality") != null)
        paramb.dMm = Integer.parseInt((String)localMap.get(".voip.camera.scannerImageQuality"));
      if (localMap.get(".voip.camera.videorecord.num") != null)
      {
        paramb.dMi = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.num"));
        paramb.dMj = true;
        paramb.dMc = true;
      }
      if (localMap.get(".voip.camera.videorecord.api20") != null)
        paramb.dMk = Integer.parseInt((String)localMap.get(".voip.camera.videorecord.api20"));
      if (localMap.get(".voip.camera.setframerate") != null)
        paramb.dMh = Integer.parseInt((String)localMap.get(".voip.camera.setframerate"));
      if (localMap.get(".voip.audio.streamtype") != null)
      {
        parama.dLd = Integer.parseInt((String)localMap.get(".voip.audio.streamtype"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.smode") != null)
      {
        parama.dLe = Integer.parseInt((String)localMap.get(".voip.audio.smode"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.omode") != null)
      {
        parama.dLf = Integer.parseInt((String)localMap.get(".voip.audio.omode"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.ospeaker") != null)
      {
        parama.dLg = Integer.parseInt((String)localMap.get(".voip.audio.ospeaker"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.operating") != null)
      {
        parama.dLh = Integer.parseInt((String)localMap.get(".voip.audio.operating"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.moperating") != null)
      {
        parama.dLi = Integer.parseInt((String)localMap.get(".voip.audio.moperating"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.mstreamtype") != null)
      {
        parama.dLj = Integer.parseInt((String)localMap.get(".voip.audio.mstreamtype"));
        parama.dLc = true;
      }
      if (localMap.get(".voip.audio.recordmode") != null)
        parama.dLk = Integer.parseInt((String)localMap.get(".voip.audio.recordmode"));
      if (localMap.get(".voip.audio.playenddelay") != null)
        parama.dLl = Integer.parseInt((String)localMap.get(".voip.audio.playenddelay"));
      if (localMap.get(".voip.audio.aecmode") != null)
        parama.dLn = Integer.parseInt((String)localMap.get(".voip.audio.aecmode"));
      if (localMap.get(".voip.audio.agcmode") != null)
        parama.dLm = Integer.parseInt((String)localMap.get(".voip.audio.agcmode"));
      if (localMap.get(".voip.audio.nsmode") != null)
        parama.dLo = Integer.parseInt((String)localMap.get(".voip.audio.nsmode"));
      if (localMap.get(".voip.audio.volummode") != null)
        parama.dLp = Integer.parseInt((String)localMap.get(".voip.audio.volummode"));
      if (localMap.get(".voip.audio.sourcemode") != null)
        parama.dLz = Integer.parseInt((String)localMap.get(".voip.audio.sourcemode"));
      if (localMap.get(".voip.audio.micmode") != null)
        parama.dLy = Integer.parseInt((String)localMap.get(".voip.audio.micmode"));
      if (localMap.get(".voip.audio.speakerMode") != null)
        parama.dLB = Integer.parseInt((String)localMap.get(".voip.audio.speakerMode"));
      if (localMap.get(".voip.audio.phoneMode") != null)
        parama.dLC = Integer.parseInt((String)localMap.get(".voip.audio.phoneMode"));
      if (localMap.get(".voip.audio.voipstreamType") != null)
        parama.dLD = Integer.parseInt((String)localMap.get(".voip.audio.voipstreamType"));
      if (localMap.get(".voip.audio.speakerstreamtype") != null)
        parama.dLE = Integer.parseInt((String)localMap.get(".voip.audio.speakerstreamtype"));
      if (localMap.get(".voip.audio.phonestreamtype") != null)
        parama.dLF = Integer.parseInt((String)localMap.get(".voip.audio.phonestreamtype"));
      if (localMap.get(".voip.audio.ringphonestream") != null)
        parama.dLH = Integer.parseInt((String)localMap.get(".voip.audio.ringphonestream"));
      if (localMap.get(".voip.audio.ringphonemode") != null)
        parama.dLI = Integer.parseInt((String)localMap.get(".voip.audio.ringphonemode"));
      if (localMap.get(".voip.audio.ringspeakerstream") != null)
        parama.dLJ = Integer.parseInt((String)localMap.get(".voip.audio.ringspeakerstream"));
      if (localMap.get(".voip.audio.ringspeakermode") != null)
        parama.dLK = Integer.parseInt((String)localMap.get(".voip.audio.ringspeakermode"));
      if (localMap.get(".voip.audio.aecmodenew") != null)
        parama.dLM = Integer.parseInt((String)localMap.get(".voip.audio.aecmodenew"));
      if (localMap.get(".voip.audio.agcmodenew") != null)
        parama.dLO = Integer.parseInt((String)localMap.get(".voip.audio.agcmodenew"));
      if (localMap.get(".voip.audio.nsmodenew") != null)
        parama.dLN = Integer.parseInt((String)localMap.get(".voip.audio.nsmodenew"));
      if (localMap.get(".voip.audio.agctargetdb") != null)
        parama.dLP = Integer.parseInt((String)localMap.get(".voip.audio.agctargetdb"));
      if (localMap.get(".voip.audio.agcgaindb") != null)
        parama.dLQ = Integer.parseInt((String)localMap.get(".voip.audio.agcgaindb"));
      if (localMap.get(".voip.audio.agcflag") != null)
        parama.dLR = Integer.parseInt((String)localMap.get(".voip.audio.agcflag"));
      if (localMap.get(".voip.audio.inputvolumescale") != null)
        parama.dLq = Integer.parseInt((String)localMap.get(".voip.audio.inputvolumescale"));
      if (localMap.get(".voip.audio.outputvolumescale") != null)
        parama.dLr = Integer.parseInt((String)localMap.get(".voip.audio.outputvolumescale"));
      if (localMap.get(".voip.audio.inputvolumescaleforspeaker") != null)
        parama.dLs = Integer.parseInt((String)localMap.get(".voip.audio.inputvolumescaleforspeaker"));
      if (localMap.get(".voip.audio.outputvolumescaleforspeaker") != null)
        parama.dLt = Integer.parseInt((String)localMap.get(".voip.audio.outputvolumescaleforspeaker"));
      if (localMap.get(".voip.audio.ehanceheadsetec") != null)
        parama.dLu = Integer.parseInt((String)localMap.get(".voip.audio.ehanceheadsetec"));
      if (localMap.get(".voip.audio.setecmodelevelforheadset") != null)
        parama.dLv = Integer.parseInt((String)localMap.get(".voip.audio.setecmodelevelforheadset"));
      if (localMap.get(".voip.audio.setecmodelevelforspeaker") != null)
        parama.dLw = Integer.parseInt((String)localMap.get(".voip.audio.setecmodelevelforspeaker"));
      if (localMap.get(".voip.audio.enablespeakerenhanceec") != null)
        parama.dLx = Integer.parseInt((String)localMap.get(".voip.audio.enablespeakerenhanceec"));
      if (localMap.get(".voip.common.js") != null)
      {
        paramn.dMB = true;
        paramn.dMC = Integer.parseInt((String)localMap.get(".voip.common.js"));
      }
      if (localMap.get(".voip.audio.playenddelay") != null)
        parama.dLl = Integer.parseInt((String)localMap.get(".voip.audio.playenddelay"));
      if (localMap.get(".voip.common.js") != null)
        paramn.dMt = Integer.parseInt((String)localMap.get(".voip.common.js"));
      if (localMap.get(".voip.common.stopbluetoothbr") != null)
        paramn.dMu = Integer.parseInt((String)localMap.get(".voip.common.stopbluetoothbr"));
      if (localMap.get(".voip.common.stopbluetoothbu") != null)
        paramn.dMv = Integer.parseInt((String)localMap.get(".voip.common.stopbluetoothbu"));
      if (localMap.get(".voip.common.setbluetoothscoon") != null)
        paramn.dMx = Integer.parseInt((String)localMap.get(".voip.common.setbluetoothscoon"));
      if (localMap.get(".voip.common.startbluetoothsco") != null)
        paramn.dMw = Integer.parseInt((String)localMap.get(".voip.common.startbluetoothsco"));
      if (localMap.get(".voip.common.voicesearchfastmode") != null)
        paramn.dMy = Integer.parseInt((String)localMap.get(".voip.common.voicesearchfastmode"));
      if (localMap.get(".voip.common.pcmreadmode") != null)
        paramn.dMA = Integer.parseInt((String)localMap.get(".voip.common.pcmreadmode"));
      if (localMap.get(".voip.common.pcmbufferrate") != null)
        paramn.dMz = Integer.parseInt((String)localMap.get(".voip.common.pcmbufferrate"));
      if (localMap.get(".voip.common.app") != null)
        paramn.dMD = Integer.parseInt((String)localMap.get(".voip.common.app"));
      if (localMap.get(".voip.common.voipapp") != null)
        paramn.dMW = Integer.parseInt((String)localMap.get(".voip.common.voipapp"));
      if (localMap.get(".voip.common.voipappns") != null)
        paramn.dMX = Integer.parseInt((String)localMap.get(".voip.common.voipappns"));
      if (localMap.get(".voip.common.voipappaec") != null)
        paramn.dMY = Integer.parseInt((String)localMap.get(".voip.common.voipappaec"));
      if (localMap.get(".voip.common.voipappagc") != null)
        paramn.dMZ = Integer.parseInt((String)localMap.get(".voip.common.voipappagc"));
      if (localMap.get(".voip.common.vmfd") != null)
        paramn.dME = Integer.parseInt((String)localMap.get(".voip.common.vmfd"));
      if (localMap.get(".voip.common.htcvoicemode") != null)
        paramn.dMF = Integer.parseInt((String)localMap.get(".voip.common.htcvoicemode"));
      if (localMap.get(".voip.common.samsungvoicemode") != null)
        paramn.dMG = Integer.parseInt((String)localMap.get(".voip.common.samsungvoicemode"));
      if (localMap.get(".voip.common.speexbufferrate") != null)
        paramn.dMH = Integer.parseInt((String)localMap.get(".voip.common.speexbufferrate"));
      if (localMap.get(".voip.common.linespe") != null)
        paramn.dMI = Integer.parseInt((String)localMap.get(".voip.common.linespe"));
      if (localMap.get(".voip.common.fixspan") != null)
        paramn.dMV = Integer.parseInt((String)localMap.get(".voip.common.fixspan"));
      if (localMap.get(".voip.common.extvideo") != null)
        paramn.dMJ = Integer.parseInt((String)localMap.get(".voip.common.extvideo"));
      if (localMap.get(".voip.common.extvideosam") != null)
        paramn.dMK = Integer.parseInt((String)localMap.get(".voip.common.extvideosam"));
      if (localMap.get(".voip.common.sysvideodegree") != null)
        paramn.dML = Integer.parseInt((String)localMap.get(".voip.common.sysvideodegree"));
      if (localMap.get(".voip.common.mmnotify") != null)
        paramn.dMO = Integer.parseInt((String)localMap.get(".voip.common.mmnotify"));
      if (localMap.get(".voip.common.extsharevcard") != null)
        paramn.dMN = Integer.parseInt((String)localMap.get(".voip.common.extsharevcard"));
      if (localMap.get(".voip.common.audioformat") != null)
        paramn.dMP = Integer.parseInt((String)localMap.get(".voip.common.audioformat"));
      if (localMap.get(".voip.common.qrcam") != null)
        paramn.dMS = Integer.parseInt((String)localMap.get(".voip.common.qrcam"));
      if (localMap.get(".voip.common.sysvideofdegree") != null)
        paramn.dMM = Integer.parseInt((String)localMap.get(".voip.common.sysvideofdegree"));
      if (localMap.get(".voip.common.audioformat") != null)
        paramn.dMP = Integer.parseInt((String)localMap.get(".voip.common.audioformat"));
      if (localMap.get(".voip.common.qrcam") != null)
        paramn.dMS = Integer.parseInt((String)localMap.get(".voip.common.qrcam"));
      if (localMap.get(".voip.common.base") != null)
        paramn.dNa = ((String)localMap.get(".voip.common.base"));
      if (localMap.get(".voip.common.packageinfo") != null)
        paramn.dNb = ((String)localMap.get(".voip.common.packageinfo"));
      if (localMap.get(".voip.common.classloader") != null)
        paramn.dNc = ((String)localMap.get(".voip.common.classloader"));
      if (localMap.get(".voip.common.resources") != null)
        paramn.dNd = ((String)localMap.get(".voip.common.resources"));
      if (localMap.get(".voip.common.sysvideofp") != null)
        paramn.dMT = Integer.parseInt((String)localMap.get(".voip.common.sysvideofp"));
      if (localMap.get(".voip.common.extstoragedir") != null)
        paramn.dNe = ((String)localMap.get(".voip.common.extstoragedir"));
      if (localMap.get(".voip.common.extpubdir") != null)
        paramn.dNf = ((String)localMap.get(".voip.common.extpubdir"));
      if (localMap.get(".voip.common.extdatadir") != null)
        paramn.dNg = ((String)localMap.get(".voip.common.extdatadir"));
      if (localMap.get(".voip.common.extrootdir") != null)
        paramn.dNh = ((String)localMap.get(".voip.common.extrootdir"));
      if (localMap.get(".voip.common.extstoragestate") != null)
        paramn.dNi = ((String)localMap.get(".voip.common.extstoragestate"));
      if (localMap.get(".voip.common.extcachedir") != null)
        paramn.dNj = ((String)localMap.get(".voip.common.extcachedir"));
      if (localMap.get(".voip.common.extvideoplayer") != null)
        paramn.dMU = ch.getInt((String)localMap.get(".voip.common.extvideoplayer"), -1);
      if (localMap.get(".voip.common.loadDrawable") != null)
        paramn.dNk = ((String)localMap.get(".voip.common.loadDrawable"));
      if (localMap.get(".voip.common.loadXmlResourceParser") != null)
        paramn.dNl = ((String)localMap.get(".voip.common.loadXmlResourceParser"));
      if ((localMap.get(".voip.common.sensorNearFar") != null) && (1 == Integer.parseInt((String)localMap.get(".voip.common.sensorNearFar"))))
        com.tencent.mm.sdk.platformtools.SensorController.iFV = true;
      boolean bool3;
      boolean bool2;
      if (localMap.get(".voip.mediaRecorder.useThisInfo") != null)
      {
        if (Integer.parseInt((String)localMap.get(".voip.mediaRecorder.useThisInfo")) == 1)
        {
          bool3 = true;
          paramz.dNJ = bool3;
        }
      }
      else
      {
        if (localMap.get(".voip.mediaRecorder.width") != null)
          paramz.dNK = Integer.parseInt((String)localMap.get(".voip.mediaRecorder.width"));
        if (localMap.get(".voip.mediaRecorder.height") != null)
          paramz.dNL = Integer.parseInt((String)localMap.get(".voip.mediaRecorder.height"));
        if (localMap.get(".voip.mediaRecorder.frameRate") != null)
          paramz.dNM = Integer.parseInt((String)localMap.get(".voip.mediaRecorder.frameRate"));
        if (localMap.get(".voip.mediaRecorder.encodingBitRate") != null)
          paramz.dNN = Integer.parseInt((String)localMap.get(".voip.mediaRecorder.encodingBitRate"));
        if (localMap.get(".voip.webview.notifythread") != null)
        {
          if (ch.getInt((String)localMap.get(".voip.webview.notifythread"), 0) != 1)
            break label5308;
          bool2 = true;
          label4169: paramaa.dNO = bool2;
        }
        if (localMap.get(".voip.webview.forceUseSysWebView") != null)
          if (ch.getInt((String)localMap.get(".voip.webview.forceUseSysWebView"), 0) != 1)
            break label5314;
      }
      label5308: label5314: for (boolean bool1 = true; ; bool1 = false)
      {
        paramaa.dNP = bool1;
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "js " + paramn.dMt);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "stopBluetoothInBR " + paramn.dMu);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "stopBluetoothInBU " + paramn.dMv);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "setBluetoothScoOn " + paramn.dMx);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "startBluetoothSco " + paramn.dMw);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "voiceSearchFastMode " + paramn.dMy);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "pcmReadMode " + paramn.dMA);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "pcmBufferRate " + paramn.dMz);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "audioPrePro " + paramn.dMD);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "voicemsgfd " + paramn.dME);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "htcvoicemode " + paramn.dMF);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "samsungvoicemode " + paramn.dMG);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "speexBufferRate " + paramn.dMH);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "linespe " + paramn.dMI);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "fixspan " + paramn.dMV);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extvideo " + paramn.dMJ);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extvideosam " + paramn.dMK);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "sysvideodegree " + paramn.dML);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "mmnotify " + paramn.dMO);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extsharevcard " + paramn.dMN);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "audioformat " + paramn.dMP);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "qrcam " + paramn.dMS);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "mBase " + paramn.dNa);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "mPackageInfo " + paramn.dNb);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "mClassLoader " + paramn.dNc);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "mResources " + paramn.dNd);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "sysvideofp " + paramn.dMT);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extstoragedir " + paramn.dNe);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extpubdir " + paramn.dNf);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extdatadir " + paramn.dNg);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extrootdir " + paramn.dNh);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extstoragestate " + paramn.dNi);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extcachedir " + paramn.dNj);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "extvideoplayer " + paramn.dMU);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "loadDrawable " + paramn.dNk);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "loadXmlResourceParser " + paramn.dNl);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "voipAudioPrePro " + paramn.dMW);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "voipAudioPreProNS " + paramn.dMX);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "voipAudioPreProAEC " + paramn.dMY);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWTxNXGYb2tlQ7HVzoZlVu", "voipAudioPreProAGC " + paramn.dMZ);
        return true;
        bool3 = false;
        break;
        bool2 = false;
        break label4169;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.y
 * JD-Core Version:    0.6.2
 */