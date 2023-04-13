package workCommandsList

import moduleWithResults.ResultModule

/**
 * Class Info. Shows information about a commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Info: Command() {

    /**
     * execute method. Returns info about collection
     *
     * @return info from command as ResultModule
     */
    override fun execute(getArgs: MutableList<Any>): ResultModule {

        val collection = workWithCollection.getCollection()

        workWithResultModule.setMessages("Тип коллекции: " + collection.javaClass.toString())
        workWithResultModule.setMessages("Размер коллекции: " + collection.size.toString())
        workWithResultModule.setMessages("Дата создания коллекции: " + workWithCollection.getInitDate().toString())

        return workWithResultModule.getResultModule()
    }
}