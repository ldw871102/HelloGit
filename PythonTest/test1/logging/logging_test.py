#! encoding=utf-8
'''
Created on 2015-2-11

@author: david
'''
import logging
logging.basicConfig(level=logging.DEBUG,format='%(levelname)s:%(message)s')
logger = logging.getLogger('logging_test')
logger.info('test start')
print 'hello'
logger.debug('test end')
logger.warning('warning')