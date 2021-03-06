DESCRIPTION = "Portable network interface information."
HOMEPAGE = "http://alastairs-place.net/netifaces"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"
SRCNAME = "netifaces"

SRC_URI = "http://distfiles.exherbo.org/distfiles/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "e0cfd6c38b39f3ea3185fa7503a81765"
SRC_URI[sha256sum] = "bd590fcb75421537d4149825e1e63cca225fd47dad861710c46bd1cb329d8cbd"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
