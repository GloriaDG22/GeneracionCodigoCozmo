# automatically generated by the FlatBuffers compiler, do not modify

# namespace: CozmoAnim

import flatbuffers

class HeadAngle(object):
    __slots__ = ['_tab']

    @classmethod
    def GetRootAsHeadAngle(cls, buf, offset):
        n = flatbuffers.encode.Get(flatbuffers.packer.uoffset, buf, offset)
        x = HeadAngle()
        x.Init(buf, n + offset)
        return x

    # HeadAngle
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # HeadAngle
    def TriggerTimeMs(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(4))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Uint32Flags, o + self._tab.Pos)
        return 0

    # HeadAngle
    def DurationTimeMs(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(6))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Uint32Flags, o + self._tab.Pos)
        return 0

    # HeadAngle
    def AngleDeg(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(8))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int8Flags, o + self._tab.Pos)
        return 0

    # HeadAngle
    def AngleVariabilityDeg(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(10))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Uint8Flags, o + self._tab.Pos)
        return 0

def HeadAngleStart(builder): builder.StartObject(4)
def HeadAngleAddTriggerTimeMs(builder, triggerTimeMs): builder.PrependUint32Slot(0, triggerTimeMs, 0)
def HeadAngleAddDurationTimeMs(builder, durationTimeMs): builder.PrependUint32Slot(1, durationTimeMs, 0)
def HeadAngleAddAngleDeg(builder, angleDeg): builder.PrependInt8Slot(2, angleDeg, 0)
def HeadAngleAddAngleVariabilityDeg(builder, angleVariabilityDeg): builder.PrependUint8Slot(3, angleVariabilityDeg, 0)
def HeadAngleEnd(builder): return builder.EndObject()
